package com.processframework.sample.firstprocess.controller

import com.processframework.framework.process.ProcessService
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

    }

}