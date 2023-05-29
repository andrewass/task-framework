package com.taskframework.sample.task.firsttask.task.subtasks

import com.taskframework.framework.task.subtask.SubtaskRunner
import com.taskframework.framework.task.subtask.SubtaskRunnerComponent
import com.taskframework.framework.task.subtask.SubtaskStatus
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubtask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity(name = "THIRD_SUBTASK")
@DiscriminatorValue("THIRD_SUBTASK")
class ThirdSubtask(
    task: DefaultTask
) : DefaultSubtask(task = task)


@SubtaskRunnerComponent("THIRD_SUBTASK")
class ThirdSubtaskRunner : SubtaskRunner<DefaultSubtask> {

    override fun run(subtask: DefaultSubtask): Pair<DefaultSubtask?, SubtaskStatus> {
        println("Running random subtask 3")
        return Pair(FourthSubtask(subtask.task), SubtaskStatus.COMPLETED)
    }
}