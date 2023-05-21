package com.taskframework.sample.task.firsttask.task.subtasks

import com.taskframework.framework.task.subtask.SubtaskRunner
import com.taskframework.framework.task.subtask.SubtaskRunnerComponent
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubtask
import com.taskframework.sample.utils.UselessService
import jakarta.persistence.DiscriminatorValue


@DiscriminatorValue("FOURTH_SUBTASK")
class FourthSubtask(
    task: DefaultTask
) : DefaultSubtask(task = task)


@SubtaskRunnerComponent("FOURTH_SUBTASK")
class FourthSubtaskRunner(
    private val uselessService: UselessService
) : SubtaskRunner<DefaultSubtask> {

    override fun runSubtask(subtask: DefaultSubtask): DefaultSubtask? {
        TODO("Not yet implemented")
    }
}