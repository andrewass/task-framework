package com.processframework.sample.common

import com.processframework.framework.task.Task
import jakarta.persistence.*

@Table(name = "TASK")
@Entity(name = "CUSTOM_TASK")
@DiscriminatorColumn(name = "TASK_NAME", discriminatorType = DiscriminatorType.STRING)
open class CustomTask(
    @Id
    @Column(name = "TASK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long? = null,

    open val personId: Long? = null
) : Task()
