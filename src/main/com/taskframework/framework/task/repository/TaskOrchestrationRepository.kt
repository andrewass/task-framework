package com.taskframework.framework.task.repository

import com.taskframework.framework.task.Task

interface TaskOrchestrationRepository {

    fun findAllIncompleteTasks() : Collection<Task>

}