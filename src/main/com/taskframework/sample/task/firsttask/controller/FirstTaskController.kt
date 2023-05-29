package com.taskframework.sample.task.firsttask.controller

import com.taskframework.sample.task.common.service.DefaultTaskOrchestrationService
import com.taskframework.sample.task.common.service.DefaultTaskService
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.firsttask.task.FirstTask
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first-task")
class FirstTaskController(
    private val taskService: DefaultTaskService,
    private val taskOrchestrationService: DefaultTaskOrchestrationService
) {

    @PostMapping("/save-task")
    fun saveTask() {
        taskService.save(FirstTask())
    }

    @GetMapping("/get-all")
    fun getAll(): List<DefaultTask> {
        return taskService.getAllTasks()
    }

    @PostMapping("/start-all")
    fun startAll() {
        taskOrchestrationService.runTasks()
    }

    @DeleteMapping("/delete-all")
    fun deleteAll() {
        taskService.deleteAllTasks()
    }
}