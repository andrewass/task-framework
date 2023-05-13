package com.taskframework.sample.task.common.service

import org.springframework.stereotype.Service
import com.taskframework.framework.repository.TaskRepository
import com.taskframework.framework.service.TaskService

@Service
class DefaultTaskService(
    repository: TaskRepository
) : TaskService(repository)