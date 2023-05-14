package com.taskframework.framework.service

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskStatus
import com.taskframework.framework.repository.TaskRepository

abstract class TaskService(
    private val repository: TaskRepository
) {

    fun save(task: Task) {
        repository.save(task)
    }

    fun getAll(): List<Task> = repository.getAll()


    fun getTasksByStatus(taskStatus: TaskStatus) {
        repository.getAllByStatus(TaskStatus.AWAITING)
    }
}