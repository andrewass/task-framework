package com.taskframework.sample.task.firsttask.task

import com.taskframework.framework.task.TaskRunner
import com.taskframework.framework.task.TaskRunnerComponent
import com.taskframework.framework.task.subtask.SubtaskRunnerFactory
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.firsttask.task.subtasks.FirstSubtask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("FIRST_TASK")
class FirstTask : DefaultTask() {

    init {
        val subTask = FirstSubtask(task = this)
        subtasks.add(subTask)
    }

    override fun run() {
        TODO("Not yet implemented")
    }
}

@TaskRunnerComponent("FIRST_TASK")
class FirstTaskRunner(
    private val subtaskRunnerFactory: SubtaskRunnerFactory
) : TaskRunner<DefaultTask> {

    override fun run(task: DefaultTask) {
        while (true) {
            task.getActiveSubtask()
                ?.also { subtask ->
                    val subtaskName = subtask.getSubtaskName()
                    subtaskRunnerFactory.getSubtaskRunner(subtaskName).run(subtask)?.also {
                        subtask.task.subtasks.add(it)
                    }
                } ?: break
        }
    }
}