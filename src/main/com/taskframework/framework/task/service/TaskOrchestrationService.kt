package com.taskframework.framework.task.service

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskRunner
import com.taskframework.framework.task.repository.TaskOrchestrationRepository

abstract class TaskOrchestrationService(
    private val repository: TaskOrchestrationRepository
) {

    fun runTasks() {
        repository.findAllIncompleteTasks()
            .forEach { getTaskRunner(it).runTask(it) }
    }

    protected abstract fun getTaskRunner(task: Task): TaskRunner
}