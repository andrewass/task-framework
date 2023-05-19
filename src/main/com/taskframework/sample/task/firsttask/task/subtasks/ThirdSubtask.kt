package com.taskframework.sample.task.firsttask.task.subtasks

import com.taskframework.framework.task.subtask.SubtaskRunnerComponent
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubtask
import jakarta.persistence.DiscriminatorValue


@DiscriminatorValue("THIRD_SUBTASK")
class ThirdSubtask(
    task: DefaultTask
) : DefaultSubtask(task = task)


@SubtaskRunnerComponent("THIRD_SUBTASK")
class ThirdSubtaskRunner {

    fun runSubtask(subtask: DefaultSubtask) {
        println("Running third subtask")
    }
}