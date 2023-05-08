package com.taskframework.sample.firsttask.controller

import com.taskframework.framework.task.TaskOrchestrationService
import com.taskframework.framework.task.TaskService
import com.taskframework.sample.firsttask.task.FirstTask
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first")
class FirstController(
    private val taskService: TaskService,
    private val taskOrchestrationService: TaskOrchestrationService
) {

    @PostMapping("/save-task")
    fun saveTask() {
        taskService.save(FirstTask(344L))
    }

    @GetMapping("/get-all")
    fun getAll() {
       taskService.getAllActiveTasks()
    }

    @PostMapping("/start-all")
    fun startAll(){

    }
}