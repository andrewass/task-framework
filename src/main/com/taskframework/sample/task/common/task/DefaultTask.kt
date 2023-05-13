package com.taskframework.sample.task.common.task

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskStatus
import jakarta.persistence.*

@Table(name = "TASK")
@Entity(name = "DEFAULT_TASK")
@DiscriminatorColumn(name = "TASK_NAME", discriminatorType = DiscriminatorType.STRING)
abstract class DefaultTask(
    @Id
    @Column(name = "TASK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long? = null,

    @OneToMany(mappedBy = "task")
    open val subTasks: List<DefaultSubTask> = mutableListOf(),

    open var taskStatus: TaskStatus = TaskStatus.CREATED

) : Task()
