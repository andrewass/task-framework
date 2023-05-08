package com.taskframework

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskFrameworkApplication

fun main(args: Array<String>) {
    runApplication<TaskFrameworkApplication>(*args)
}
