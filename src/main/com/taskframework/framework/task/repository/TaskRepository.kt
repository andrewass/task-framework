package com.taskframework.framework.task.repository

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskStatus

interface TaskRepository {
    fun save(task: Task)

    fun getAll(): Collection<Task>

    fun getAllByStatus(status: TaskStatus) : Collection<Task>
}