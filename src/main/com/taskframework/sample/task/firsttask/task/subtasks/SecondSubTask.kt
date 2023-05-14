package com.taskframework.sample.task.firsttask.task.subtasks

import com.taskframework.framework.task.subtask.SubTask
import com.taskframework.framework.task.subtask.SubTaskRunner
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubTask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import org.springframework.stereotype.Component


@Entity(name = "SECOND_SUBTASK")
@DiscriminatorValue("SECOND_SUBTASK")
class SecondSubTask(
    task: DefaultTask
) : DefaultSubTask(task = task)


@Component("SECOND_SUBTASK_RUNNER")
class SecondSubTaskTaskRunner : SubTaskRunner {

    override fun runSubTask(subTask: SubTask) {
        TODO("Not yet implemented")
    }
}