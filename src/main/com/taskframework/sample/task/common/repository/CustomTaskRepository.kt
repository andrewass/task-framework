package com.taskframework.sample.task.common.repository

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.repository.TaskRepository
import com.taskframework.framework.task.TaskStatus
import com.taskframework.sample.task.common.task.DefaultTask
import org.springframework.stereotype.Repository

@Repository
class CustomTaskRepository(
    private val repository: TaskJpaRepository
) : TaskRepository {

    override fun save(task: Task) {
        val response = repository.save(task as DefaultTask)
        val test = 323
    }

    override fun getAll(): List<Task> {
        val response = repository.findAll()
        return response
    }

    override fun getAllByStatus(status: TaskStatus): Collection<Task> {
        TODO("Not yet implemented")
    }
}