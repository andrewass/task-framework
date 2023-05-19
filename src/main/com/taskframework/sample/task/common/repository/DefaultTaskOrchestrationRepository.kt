package com.taskframework.sample.task.common.repository

import com.taskframework.framework.task.TaskStatus
import com.taskframework.sample.task.common.task.DefaultTask
import org.springframework.stereotype.Repository

@Repository
class DefaultTaskOrchestrationRepository(
    private val repository: TaskOrchestrationJpaRepository
) {
    fun findAllIncompleteTasks(): List<DefaultTask> {
        return repository.findAllByTaskStatusIn(listOf(TaskStatus.AWAITING, TaskStatus.CREATED, TaskStatus.IN_PROGRESS))
    }
}