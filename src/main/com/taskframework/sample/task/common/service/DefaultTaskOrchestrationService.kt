package com.taskframework.sample.task.common.service

import com.taskframework.framework.task.Task
import com.taskframework.framework.repository.TaskOrchestrationRepository
import com.taskframework.framework.service.TaskOrchestrationService
import com.taskframework.framework.task.TaskRunner
import org.springframework.beans.factory.FactoryBean
import org.springframework.stereotype.Service

@Service
class DefaultTaskOrchestrationService(
    private val repository: TaskOrchestrationRepository,
    private val factory : FactoryBean<*>
) : TaskOrchestrationService(repository) {


    override fun getTaskRunner(task: Task): TaskRunner {
        TODO("Not yet implemented")
    }
}