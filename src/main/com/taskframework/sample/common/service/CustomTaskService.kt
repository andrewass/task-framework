package com.taskframework.sample.common.service

import org.springframework.stereotype.Service
import com.taskframework.framework.task.TaskRepository
import com.taskframework.framework.task.TaskService

@Service
class CustomTaskService(
    repository: TaskRepository
) : TaskService(repository)