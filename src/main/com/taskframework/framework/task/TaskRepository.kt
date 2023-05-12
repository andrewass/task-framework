package com.taskframework.framework.task

interface TaskRepository {
    fun save(task: Task)

    fun getAll(): Collection<Task>

    fun getAllByStatus(status: TaskStatus) : Collection<Task>
}