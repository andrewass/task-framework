package com.processframework.framework.task

abstract class TaskService(
    private val processRepository: TaskRepository
) {

    fun save(process: Task) {
        processRepository.save(process)
    }

    fun getAllActiveProcesses() =
        processRepository.getAll()
}