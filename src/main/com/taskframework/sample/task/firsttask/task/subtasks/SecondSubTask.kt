package com.taskframework.sample.task.firsttask.task.subtasks

import com.taskframework.framework.task.subtask.SubTaskRunnerComponent
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubTask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity


@Entity(name = "SECOND_SUBTASK")
@DiscriminatorValue("SECOND_SUBTASK")
class SecondSubTask(
    task: DefaultTask
) : DefaultSubTask(task = task)


@SubTaskRunnerComponent("SECOND_SUBTASK")
class SecondSubTaskRunner {

    fun runSubTask(subTask: DefaultSubTask) {
        println("Running second subtask")
    }
}