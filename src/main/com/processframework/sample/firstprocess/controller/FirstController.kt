package com.processframework.sample.firstprocess.controller

import com.processframework.framework.process.ProcessService
import com.processframework.sample.firstprocess.process.FirstProcess
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first")
class FirstController(
    private val service: ProcessService
) {

    @PostMapping("/save-process")
    fun saveProcess() {
        service.save(FirstProcess(344L))
    }

    @GetMapping("/get-all")
    fun getAll() {
       service.getAllActiveProcesses()
    }
}