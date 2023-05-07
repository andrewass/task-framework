package com.processframework.sample.common

import com.processframework.framework.process.ProcessOrchestrationService
import com.processframework.framework.process.ProcessRepository
import org.springframework.stereotype.Service

@Service
class CustomProcessOrchestrationService(
    processRepository: ProcessRepository
): ProcessOrchestrationService(processRepository)