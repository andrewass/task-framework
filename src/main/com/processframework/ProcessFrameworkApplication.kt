package com.processframework

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProcessFrameworkApplication

fun main(args: Array<String>) {
    runApplication<ProcessFrameworkApplication>(*args)
}
