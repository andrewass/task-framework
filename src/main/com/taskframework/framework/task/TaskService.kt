package com.taskframework.framework.task

abstract class TaskService(
    private val repository: TaskRepository
) {

    fun save(task: Task) {
        repository.save(task)
    }

    fun getTasksByStatus(taskStatus: TaskStatus){
        repository.getAllByStatus()
    }
}