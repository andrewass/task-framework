package com.taskframework.framework.task

interface TaskOrchestrationRepository {

    fun findAllIncompleteTasks() : Collection<Task>

}