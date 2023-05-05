package com.processframework.framework.process

interface ProcessOrchestrationRepository {

    fun findAllIncompleteProcesses() : Collection<Process>

}