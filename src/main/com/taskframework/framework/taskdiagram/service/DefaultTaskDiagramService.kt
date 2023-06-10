package com.taskframework.framework.taskdiagram.service

import com.taskframework.framework.taskdiagram.domain.SubtaskRepresentation
import com.taskframework.framework.taskdiagram.domain.TaskRepresentation
import org.springframework.stereotype.Service


@Service
class DefaultTaskDiagramService : TaskDiagramService {

    override fun getTaskRepresentation(taskName: String): TaskRepresentation {
        return TaskRepresentation(name = "hello", SubtaskRepresentation(name = "world"))
    }
}