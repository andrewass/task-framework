package com.taskframework.sample.task.firsttask.controller

import com.taskframework.framework.taskdiagram.domain.TaskRepresentation
import com.taskframework.framework.taskdiagram.service.TaskDiagramService
import com.taskframework.sample.task.common.service.DefaultTaskOrchestrationService
import com.taskframework.sample.task.common.service.DefaultTaskService
import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.firsttask.task.FirstTask
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/first-task")
class FirstTaskController(
    private val taskService: DefaultTaskService,
    private val taskDiagramService: TaskDiagramService,
    private val taskOrchestrationService: DefaultTaskOrchestrationService,
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

    @GetMapping("/get-task-representation")
    fun getTaskRepresentation(@RequestParam name: String): TaskRepresentation {
        return taskDiagramService.getTaskRepresentation(name)
    }
}