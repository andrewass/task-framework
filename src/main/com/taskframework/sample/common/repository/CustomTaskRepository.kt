package com.taskframework.sample.common.repository

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskRepository
import com.taskframework.sample.common.task.CustomTask
import org.springframework.stereotype.Repository

@Repository
class CustomTaskRepository(
    private val repository: TaskJpaRepository
) : TaskRepository {

    override fun save(task: Task) {
        val response = repository.save(task as CustomTask)
        val test = 323
    }

    override fun getAll(): Collection<Task> {
        val response = repository.findAll()
        return response
    }
}