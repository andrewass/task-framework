package com.processframework.framework.task

interface TaskOrchestrationRepository {

    fun findAllIncompleteTasks() : Collection<Task>

}