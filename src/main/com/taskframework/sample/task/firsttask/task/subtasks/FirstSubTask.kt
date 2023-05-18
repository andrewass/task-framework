package com.taskframework.sample.task.firsttask.task.subtasks

import com.taskframework.framework.task.subtask.SubTaskRunnerComponent
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubTask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity(name = "FIRST_SUBTASK")
@DiscriminatorValue("FIRST_SUBTASK")
class FirstSubTask(
    task: DefaultTask
) : DefaultSubTask(task = task)


@SubTaskRunnerComponent("FIRST_SUBTASK")
class FirstSubTaskRunner {

    fun runSubTask(subTask: DefaultSubTask) {
        TODO("Not yet implemented")
    }
}