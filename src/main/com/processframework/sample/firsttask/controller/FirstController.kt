package com.processframework.sample.firsttask.controller

import com.processframework.framework.task.TaskOrchestrationService
import com.processframework.framework.task.TaskService
import com.processframework.sample.firsttask.task.FirstTask
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first")
class FirstController(
    private val processService: TaskService,
    private val processOrchestrationService: TaskOrchestrationService
) {

    @PostMapping("/save-task")
    fun saveProcess() {
        processService.save(FirstTask(344L))
    }

    @GetMapping("/get-all")
    fun getAll() {
       processService.getAllActiveProcesses()
    }

    @PostMapping("/start-all")
    fun startAll(){

    }
}