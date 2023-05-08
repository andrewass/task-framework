package com.processframework.framework.task

interface TaskRepository {
    fun save(task: Task)

    fun getAll(): Collection<Task>
}