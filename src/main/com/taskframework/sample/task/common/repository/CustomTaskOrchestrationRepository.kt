package com.taskframework.sample.task.common.repository

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskOrchestrationRepository
import org.springframework.stereotype.Repository

@Repository
class CustomTaskOrchestrationRepository(
    repository: TaskOrchestrationJpaRepository
) : TaskOrchestrationRepository {

    override fun findAllIncompleteTasks(): Collection<Task> {
        TODO("Not yet implemented")
    }
}