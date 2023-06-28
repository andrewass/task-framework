package com.taskframework.sample.task.firsttask.task.subtasks

import com.taskframework.framework.task.subtask.SubtaskRunner
import com.taskframework.framework.task.subtask.SubtaskRunnerComponent
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubtask
import com.taskframework.sample.utils.UselessService
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity(name = "FIRST_SUBTASK")
@DiscriminatorValue("FIRST_SUBTASK")
class FirstSubtask(
    task: DefaultTask
) : DefaultSubtask(task = task)


@SubtaskRunnerComponent("FIRST_SUBTASK")
class FirstSubtaskRunner(
    private val uselessService: UselessService
) : SubtaskRunner<DefaultSubtask> {

    override fun run(subtask: DefaultSubtask): DefaultSubtask? {
        println("Running first subtask ${uselessService.getSomethingUseless()}")

        return SecondSubtask(subtask.task)
    }
}