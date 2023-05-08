package com.processframework.sample.common

import com.processframework.framework.task.Task
import com.processframework.framework.task.TaskRepository
import com.processframework.sample.common.repository.TaskJpaRepository
import org.springframework.stereotype.Repository

@Repository
class CustomRepository(
    private val jpaRepository: TaskJpaRepository
) : TaskRepository {

    override fun save(task: Task) {
        val response = jpaRepository.save(task as CustomTask)
        val test = 323
    }

    override fun getAll(): Collection<Task> {
        val response = jpaRepository.findAll()
        return response
    }
}