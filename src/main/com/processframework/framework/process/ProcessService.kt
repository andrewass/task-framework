package com.processframework.framework.process

abstract class ProcessService(
    private val processRepository: ProcessRepository
) {

    fun save(process: Process) {
        processRepository.save(process)
    }
}