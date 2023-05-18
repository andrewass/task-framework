package com.taskframework.sample.task.firsttask.task

import com.taskframework.framework.task.TaskRunnerComponent
import com.taskframework.sample.task.common.task.DefaultTask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("FIRST_TASK")
class FirstTask(
    personId: Long
) : DefaultTask()


@TaskRunnerComponent("FIRST_TASK")
class FirstTaskRunner {

    fun runTask(task: DefaultTask) {
        println("Running first task")
    }
}