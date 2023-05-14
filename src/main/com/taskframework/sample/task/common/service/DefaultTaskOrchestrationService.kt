package com.taskframework.sample.task.common.service

import com.taskframework.framework.repository.TaskOrchestrationRepository
import com.taskframework.framework.service.TaskOrchestrationService
import com.taskframework.framework.task.TaskRunnerFactory
import org.springframework.stereotype.Service

@Service
class DefaultTaskOrchestrationService(
    private val repository: TaskOrchestrationRepository,
    private val taskRunnerFactory: TaskRunnerFactory
) : TaskOrchestrationService(repository, taskRunnerFactory)