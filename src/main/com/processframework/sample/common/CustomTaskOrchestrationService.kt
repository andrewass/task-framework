package com.processframework.sample.common

import com.processframework.framework.task.TaskOrchestrationRepository
import com.processframework.framework.task.TaskOrchestrationService
import org.springframework.stereotype.Service

@Service
class CustomTaskOrchestrationService(
    repository: TaskOrchestrationRepository
) : TaskOrchestrationService(repository)