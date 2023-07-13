package com.taskframework.sample.task.common.task.subtask

import com.taskframework.framework.task.subtask.Subtask
import com.taskframework.framework.task.subtask.SubtaskStatus
import com.taskframework.sample.task.common.task.DefaultTask
import jakarta.persistence.*
import java.time.LocalDateTime

@Table
@Entity(name = "DEFAULT_SUBTASK")
@DiscriminatorColumn(name = "SUBTASK_NAME", discriminatorType = DiscriminatorType.STRING)
abstract class DefaultSubtask(

    @Id
    @Column(name = "SUBTASK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "TASK_ID")
    open val task: DefaultTask,

    open var subtaskStatus: SubtaskStatus = SubtaskStatus.ACTIVE,

    open var delayedTo: LocalDateTime? = null,
) : Subtask() {

    @Transient
    fun getSubtaskName(): String = this.javaClass.getAnnotation(DiscriminatorValue::class.java).value
}