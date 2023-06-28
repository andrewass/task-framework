package com.taskframework.sample.task.common.task

import com.taskframework.framework.task.TaskRunner
import com.taskframework.framework.task.TaskStatus
import com.taskframework.framework.task.subtask.SubtaskRunnerFactory
import com.taskframework.framework.task.subtask.SubtaskStatus
import com.taskframework.sample.task.common.repository.DefaultTaskRepository
import com.taskframework.sample.task.common.task.subtask.DefaultSubtask
import org.springframework.stereotype.Component

@Component
class DefaultTaskRunner(
    private val subtaskRunnerFactory: SubtaskRunnerFactory<DefaultSubtask>,
    private val taskRepository: DefaultTaskRepository,
) : TaskRunner<DefaultTask> {

    override fun run(task: DefaultTask) {
        while (true) {
            task.getActiveSubtask()
                ?.also { subtask ->
                    subtask.delayedTo = null
                    val nextSubtask = subtaskRunnerFactory.getSubtaskRunner(subtask.getSubtaskName()).run(subtask)
                    updateTask(task, subtask, nextSubtask)
                }
                ?: break
        }
    }

    private fun updateTask(task: DefaultTask, currentSubtask: DefaultSubtask, nextTask: DefaultSubtask?) {
        nextTask?.also {
            currentSubtask.subtaskStatus = SubtaskStatus.COMPLETED
            task.subtasks.add(nextTask)
        } ?: postProcessUpdateStatus(task, currentSubtask)
        taskRepository.save(task)
    }

    private fun postProcessUpdateStatus(task: DefaultTask, currentSubtask: DefaultSubtask) {
        if (currentSubtask.delayedTo != null) {
            currentSubtask.subtaskStatus = SubtaskStatus.AWAITING
            task.taskStatus = TaskStatus.AWAITING
        } else {
            currentSubtask.subtaskStatus = SubtaskStatus.COMPLETED
            task.taskStatus = TaskStatus.COMPLETED
        }
    }
}