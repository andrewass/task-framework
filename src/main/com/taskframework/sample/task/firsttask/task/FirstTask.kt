package com.taskframework.sample.task.firsttask.task

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskRunner
import com.taskframework.sample.task.common.task.DefaultTask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import org.springframework.stereotype.Component

@Entity(name = "FIRST_TASK")
@DiscriminatorValue("FIRST_TASK")
class FirstTask(
    personId: Long
) : DefaultTask()


@Component
class FirstTaskRunner : TaskRunner {

    override fun runTask(task: Task) {
        TODO("Not yet implemented")
    }
}