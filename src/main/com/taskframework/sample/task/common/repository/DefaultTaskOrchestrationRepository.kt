package com.taskframework.sample.task.common.repository

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskStatus
import com.taskframework.framework.repository.TaskOrchestrationRepository
import org.springframework.stereotype.Repository

@Repository
class DefaultTaskOrchestrationRepository(
    private val repository: TaskOrchestrationJpaRepository
) : TaskOrchestrationRepository {

    override fun findAllIncompleteTasks(): List<Task> {
        return repository.findAllByTaskStatusIn(listOf(TaskStatus.AWAITING, TaskStatus.CREATED, TaskStatus.IN_PROGRESS))
    }

}