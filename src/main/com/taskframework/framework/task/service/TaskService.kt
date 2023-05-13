package com.taskframework.framework.task.service

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.TaskStatus
import com.taskframework.framework.task.repository.TaskRepository

abstract class TaskService(
    private val repository: TaskRepository
) {

    fun save(task: Task) {
        repository.save(task)
    }

    fun getTasksByStatus(taskStatus: TaskStatus){
        repository.getAllByStatus(TaskStatus.AWAITING)
    }
}