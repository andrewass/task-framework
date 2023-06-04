package com.taskframework.framework.taskdiagram.service

import com.taskframework.framework.task.TaskRunnerComponent
import com.taskframework.framework.taskdiagram.domain.SubtaskRepresentation
import com.taskframework.framework.taskdiagram.domain.TaskRepresentation
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider
import org.springframework.core.type.filter.AnnotationTypeFilter
import org.springframework.stereotype.Service


@Service
class DefaultTaskDiagramService : TaskDiagramService {

    override fun getTaskRepresentation(taskName: String): TaskRepresentation {
        val provider = ClassPathScanningCandidateComponentProvider(false)
        provider.addIncludeFilter(AnnotationTypeFilter(TaskRunnerComponent::class.java))

        provider.findCandidateComponents("com.taskframework.sample")
        val test = 33

        return TaskRepresentation(name = "hello", SubtaskRepresentation(name = "world"))
    }
}