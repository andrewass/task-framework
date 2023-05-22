package com.taskframework.sample.task.common.service

import com.taskframework.framework.task.TaskRunnerFactory
import com.taskframework.sample.task.common.repository.DefaultTaskOrchestrationRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class DefaultTaskOrchestrationService(
    private val repository: DefaultTaskOrchestrationRepository,
    private val taskRunnerFactory: TaskRunnerFactory,
) {

    fun runTasks() {
        repository.findAllIncompleteTasks()
            .filter { it.isEligibleForRunning() }
            .forEach {
                val taskName = it.getTaskName()
                taskRunnerFactory.getTaskRunner(taskName).run(it)
            }
    }
}