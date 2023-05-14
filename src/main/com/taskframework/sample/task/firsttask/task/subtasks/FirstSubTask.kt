package com.taskframework.sample.task.firsttask.task.subtasks

import com.taskframework.framework.task.subtask.SubTask
import com.taskframework.framework.task.subtask.SubTaskRunner
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubTask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import org.springframework.stereotype.Component

@Entity(name = "FIRST_SUBTASK")
@DiscriminatorValue("FIRST_SUBTASK")
class FirstSubTask(
    task: DefaultTask
) : DefaultSubTask(task = task)


@Component("FIRST_SUBTASK_RUNNER")
class FirstSubTaskRunner : SubTaskRunner {

    override fun runSubTask(subTask: SubTask) {
        TODO("Not yet implemented")
    }
}