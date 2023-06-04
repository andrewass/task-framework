package com.taskframework.framework.taskdiagram.service

import com.taskframework.framework.taskdiagram.domain.TaskRepresentation

interface TaskDiagramService {
    fun getTaskRepresentation(taskName: String): TaskRepresentation
}