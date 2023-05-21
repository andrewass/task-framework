package com.taskframework.sample.task.firsttask.task.subtasks

import com.taskframework.framework.task.subtask.Subtask
import com.taskframework.framework.task.subtask.SubtaskRunner
import com.taskframework.framework.task.subtask.SubtaskRunnerComponent
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubtask
import com.taskframework.sample.utils.UselessService
import jakarta.persistence.DiscriminatorValue


@DiscriminatorValue("THIRD_SUBTASK")
class ThirdSubtask(
    task: DefaultTask
) : DefaultSubtask(task = task)


@SubtaskRunnerComponent("THIRD_SUBTASK")
class ThirdSubtaskRunner(
    private val uselessService: UselessService
) : SubtaskRunner {

    override fun runSubtask(subtask: Subtask): Subtask? {
        TODO("Not yet implemented")
    }
}