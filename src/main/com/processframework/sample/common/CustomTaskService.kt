package com.processframework.sample.common

import org.springframework.stereotype.Service
import com.processframework.framework.task.TaskRepository
import com.processframework.framework.task.TaskService

@Service
class CustomTaskService(
    processRepository: TaskRepository
) : TaskService(processRepository)