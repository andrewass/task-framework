package com.taskframework.sample.task.firsttask.task.subtasks

import com.taskframework.framework.task.subtask.SubtaskRunner
import com.taskframework.framework.task.subtask.SubtaskRunnerComponent
import com.taskframework.framework.task.subtask.SubtaskStatus
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubtask
import com.taskframework.sample.utils.UselessService
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity


@Entity(name = "SECOND_SUBTASK")
@DiscriminatorValue("SECOND_SUBTASK")
class SecondSubtask(
    task: DefaultTask
) : DefaultSubtask(task = task)


@SubtaskRunnerComponent("SECOND_SUBTASK")
class SecondSubtaskRunner(
    private val uselessService: UselessService
) : SubtaskRunner<DefaultSubtask> {

    override fun run(subtask: DefaultSubtask): Pair<DefaultSubtask?, SubtaskStatus> {
        return if (uselessService.getRandomNumber().mod(2) == 0) {
            println("Redirect to third subtask in second task")
            Pair(ThirdSubtask(subtask.task), SubtaskStatus.COMPLETED)
        } else {
            println("Redirect to fourth subtask in second task")
            Pair(FourthSubtask(subtask.task), SubtaskStatus.COMPLETED)
        }
    }
}