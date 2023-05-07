package com.processframework.sample.firstprocess.controller

import com.processframework.framework.process.ProcessOrchestrationService
import com.processframework.framework.process.ProcessService
import com.processframework.sample.firstprocess.process.FirstProcess
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first")
class FirstController(
    private val processService: ProcessService,
    private val processOrchestrationService: ProcessOrchestrationService
) {

    @PostMapping("/save-process")
    fun saveProcess() {
        processService.save(FirstProcess(344L))
    }

    @GetMapping("/get-all")
    fun getAll() {
       processService.getAllActiveProcesses()
    }

    @PostMapping("/start-all")
    fun startAll(){

    }
}