package com.taskframework.sample.task.common.task.subtask

import com.taskframework.sample.task.common.task.DefaultTask
import jakarta.persistence.*

@Table
@Entity(name = "DEFAULT_SUBTASK")
@DiscriminatorColumn(name = "SUBTASK_NAME", discriminatorType = DiscriminatorType.STRING)
abstract class DefaultSubTask(

    @Id
    @Column(name = "SUBTASK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "TASK_ID")
    open val task: DefaultTask
)