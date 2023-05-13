package com.taskframework.sample.task.common.controller

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.service.TaskOrchestrationService
import com.taskframework.framework.task.service.TaskService
import com.taskframework.sample.task.firsttask.task.FirstTask
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/task")
class TaskController(
    private val taskService: TaskService,
    private val taskOrchestrationService: TaskOrchestrationService
) {

    @PostMapping("/save-task")
    fun saveTask() {
        taskService.save(FirstTask(344L))
    }

    @GetMapping("/get-all")
    fun getAll(): List<Task> {
        return taskService.getAll()
    }

    @PostMapping("/start-all")
    fun startAll() {
        taskOrchestrationService.runTasks()
    }
}