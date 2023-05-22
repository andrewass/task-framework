package com.taskframework.sample.task.common.service

import com.taskframework.sample.task.common.repository.DefaultTaskRepository
import com.taskframework.sample.task.common.task.DefaultTask
import org.springframework.stereotype.Service

@Service
class DefaultTaskService(
    private val repository: DefaultTaskRepository
) {

    fun save(task: DefaultTask): DefaultTask = repository.save(task)

    fun getAllTasks(): List<DefaultTask> = repository.getAll()


}