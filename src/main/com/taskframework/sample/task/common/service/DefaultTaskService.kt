package com.taskframework.sample.task.common.service

import org.springframework.stereotype.Service
import com.taskframework.framework.task.repository.TaskRepository
import com.taskframework.framework.task.service.TaskService

@Service
class DefaultTaskService(
    repository: TaskRepository
) : TaskService(repository)