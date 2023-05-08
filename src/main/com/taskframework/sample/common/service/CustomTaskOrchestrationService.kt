package com.taskframework.sample.common.service

import com.taskframework.framework.task.TaskOrchestrationRepository
import com.taskframework.framework.task.TaskOrchestrationService
import org.springframework.stereotype.Service

@Service
class CustomTaskOrchestrationService(
    repository: TaskOrchestrationRepository
) : TaskOrchestrationService(repository)