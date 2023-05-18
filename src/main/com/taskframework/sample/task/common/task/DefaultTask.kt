package com.taskframework.sample.task.common.task

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskStatus
import com.taskframework.framework.task.subtask.SubTaskStatus
import com.taskframework.sample.task.common.task.subtask.DefaultSubTask
import jakarta.persistence.*
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import java.time.LocalDateTime


@Entity
@Table(name = "TASK")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TASK_NAME", discriminatorType = DiscriminatorType.STRING)
abstract class DefaultTask(

    @Id
    @Column(name = "TASK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long? = null,

    @OneToMany(mappedBy = "task")
    @Cascade(CascadeType.ALL)
    open val subTasks: List<DefaultSubTask> = mutableListOf(),

    open var taskStatus: TaskStatus = TaskStatus.CREATED,

    open val resumeTime: LocalDateTime? = null
) : Task() {

    @Transient
    fun getTaskName(): String = this.javaClass.getAnnotation(DiscriminatorValue::class.java).value

    fun isEligibleForRunning(): Boolean = resumeTime?.isAfter(LocalDateTime.now()) != true

    private fun getActiveSubTask(): DefaultSubTask = subTasks
        .first { listOf(SubTaskStatus.ACTIVE, SubTaskStatus.AWAITING).contains(it.subTaskStatus) }

    override fun run() {
        println("Running")
    }

}
