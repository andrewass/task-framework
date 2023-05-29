package com.taskframework.sample.task.common.repository

import com.taskframework.framework.task.TaskStatus
import com.taskframework.sample.task.common.task.DefaultTask
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
class DefaultTaskRepository(
    private val repository: TaskJpaRepository
) {

    fun save(task: DefaultTask): DefaultTask = repository.save(task)

    fun getAll(): List<DefaultTask> {
        val response = repository.findAll()
        return response
    }

    fun getAllByStatus(status: TaskStatus): Collection<DefaultTask> {
        TODO("Not yet implemented")
    }

    fun deleteAll() {
        repository.deleteAll()
    }
}