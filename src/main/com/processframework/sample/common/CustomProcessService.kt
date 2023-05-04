package com.processframework.sample.common

import org.springframework.stereotype.Service
import com.processframework.framework.process.ProcessRepository
import com.processframework.framework.process.ProcessService

@Service
class CustomProcessService(
    processRepository: ProcessRepository
) : ProcessService(processRepository)