package com.taskframework.framework.repository

import com.taskframework.framework.task.Task

interface TaskOrchestrationRepository {

    fun findAllIncompleteTasks() : Collection<Task>

}