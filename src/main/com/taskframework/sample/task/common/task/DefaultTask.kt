package com.taskframework.sample.task.common.task

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskStatus
import com.taskframework.sample.task.common.task.subtask.DefaultSubTask
import jakarta.persistence.*


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
    open val subTasks: List<DefaultSubTask> = mutableListOf(),

    open var taskStatus: TaskStatus = TaskStatus.CREATED

) : Task {

    override fun run() {
        TODO("Not yet implemented")
    }

    override fun getTaskName(): String {
        TODO("Not yet implemented")
    }
}
