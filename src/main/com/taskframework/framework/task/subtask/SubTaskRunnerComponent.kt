package com.taskframework.framework.task.subtask

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

@Target(AnnotationTarget.CLASS)
annotation class SubTaskRunnerComponent(
    @get:AliasFor(annotation = Component::class) val value: String = ""
)

