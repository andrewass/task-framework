package com.taskframework.sample.task.common.service

import com.taskframework.framework.task.Task
import com.taskframework.framework.task.repository.TaskOrchestrationRepository
import com.taskframework.framework.task.service.TaskOrchestrationService
import com.taskframework.framework.task.TaskRunner
import org.springframework.beans.factory.FactoryBean
import org.springframework.stereotype.Service

@Service
class DefaultTaskOrchestrationService(
    repository: TaskOrchestrationRepository,
    private val factory : FactoryBean<*>
) : TaskOrchestrationService(repository) {


    override fun getTaskRunner(task: Task): TaskRunner {
        TODO("Not yet implemented")
    }
}