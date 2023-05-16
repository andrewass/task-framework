package com.taskframework.sample.task.common.service

import com.taskframework.framework.task.TaskRunnerFactory
import com.taskframework.sample.task.common.repository.DefaultTaskOrchestrationRepository
import org.springframework.stereotype.Service

@Service
class DefaultTaskOrchestrationService(
    repository: DefaultTaskOrchestrationRepository,
    taskRunnerFactory: TaskRunnerFactory
)