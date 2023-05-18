package com.taskframework.sample.task.firsttask.task

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskRunner
import com.taskframework.framework.task.TaskRunnerComponent
import com.taskframework.sample.task.common.task.DefaultTask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("FIRST_TASK")
class FirstTask(
    personId: Long
) : DefaultTask() {

    override fun run() {
        TODO("Not yet implemented")
    }
}


@TaskRunnerComponent("FIRST_TASK")
class FirstTaskRunner : TaskRunner {

    override fun run(task: Task) {
        TODO("Not yet implemented")
    }
}