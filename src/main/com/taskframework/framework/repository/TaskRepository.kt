package com.taskframework.framework.repository

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskStatus

interface TaskRepository {
    fun save(task: Task)

    fun getAll(): List<Task>

    fun getAllByStatus(status: TaskStatus) : Collection<Task>
}