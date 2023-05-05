package com.processframework.framework

import com.processframework.framework.process.ProcessOrchestrationRepository

abstract class ProcessOrchestration(
    private val repository: ProcessOrchestrationRepository
){

    fun run(){
        repository.findAllIncompleteProcesses().forEach {
        }
    }

}