package com.processframework.framework

import com.processframework.framework.task.TaskOrchestrationRepository

abstract class ProcessOrchestration(
    private val repository: TaskOrchestrationRepository
) {

    fun run() {
        repository.findAllIncompleteTasks().forEach {
            it.run()
        }
    }

}