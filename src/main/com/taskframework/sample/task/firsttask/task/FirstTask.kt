package com.taskframework.sample.task.firsttask.task

import com.taskframework.framework.task.TaskRunner
import com.taskframework.framework.task.TaskRunnerComponent
import com.taskframework.framework.task.TaskStatus
import com.taskframework.framework.task.subtask.SubtaskRunnerFactory
import com.taskframework.framework.task.subtask.SubtaskStatus
import com.taskframework.sample.task.common.repository.DefaultTaskRepository
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.common.task.subtask.DefaultSubtask
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
    private val subtaskRunnerFactory: SubtaskRunnerFactory<DefaultSubtask>,
    private val taskRepository: DefaultTaskRepository,
) : TaskRunner<DefaultTask> {

    override fun run(task: DefaultTask) {
        while (true) {
            task.getActiveSubtask()
                ?.also { subtask ->
                    subtaskRunnerFactory.getSubtaskRunner(subtask.getSubtaskName())
                        .run(subtask)
                        .also { (nextSubtask, currentSubtaskStatus) ->
                            processResult(subtask, currentSubtaskStatus, nextSubtask, task)
                        }
                } ?: break
        }
    }

    private fun processResult(
        currentSubtask: DefaultSubtask, currentSubtaskStatus: SubtaskStatus,
        nextSubtask: DefaultSubtask?, task: DefaultTask
    ) {
        when (currentSubtaskStatus) {
            SubtaskStatus.COMPLETED -> processCompletedSubtask(currentSubtask, nextSubtask, task)
            SubtaskStatus.AWAITING -> processAwaitingSubtask(currentSubtask)
            SubtaskStatus.ACTIVE -> TODO()
        }
        taskRepository.save(task)
    }

    private fun processCompletedSubtask(
        currentSubtask: DefaultSubtask,
        nextSubtask: DefaultSubtask?,
        task: DefaultTask
    ) {
        currentSubtask.subtaskStatus = SubtaskStatus.COMPLETED
        if (nextSubtask != null) {
            task.subtasks.add(nextSubtask)
            task.taskStatus = TaskStatus.IN_PROGRESS
        } else {
            task.taskStatus = TaskStatus.COMPLETED
        }
    }

    private fun processAwaitingSubtask(subtask: DefaultSubtask) {}
}