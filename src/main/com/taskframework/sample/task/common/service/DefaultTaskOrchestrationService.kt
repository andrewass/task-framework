package com.taskframework.sample.task.common.service

import com.taskframework.framework.task.TaskRunner
import com.taskframework.sample.task.common.repository.DefaultTaskOrchestrationRepository
import com.taskframework.sample.task.common.task.DefaultTask
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class DefaultTaskOrchestrationService(
    private val repository: DefaultTaskOrchestrationRepository,
    private val taskRunner: TaskRunner<DefaultTask>,
) {

    fun runTasks() {
        repository.findAllIncompleteTasks()
            .filter { it.isEligibleForRunning() }
            .forEach { taskRunner.run(it) }
    }
}