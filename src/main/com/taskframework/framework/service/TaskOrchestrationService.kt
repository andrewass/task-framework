package com.taskframework.framework.service

import com.taskframework.framework.repository.TaskOrchestrationRepository
import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskRunner
import com.taskframework.framework.task.TaskRunnerFactory

abstract class TaskOrchestrationService(
    private val repository: TaskOrchestrationRepository,
    private val taskRunnerFactory: TaskRunnerFactory
) {

    fun runTasks() {
        repository.findAllIncompleteTasks()
            .forEach {
                val taskRunner = getTaskRunner(it)
                taskRunner.runTask(it)
            }
    }

    private fun getTaskRunner(task: Task) : TaskRunner {
        return taskRunnerFactory.getTaskRunner(task.getTaskName())
    }
}