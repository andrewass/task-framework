package com.taskframework.framework.taskdiagram.domain

class SubtaskRepresentation(
    val name: String,
    val nextSubtasks: List<SubtaskRepresentation> = emptyList()
)