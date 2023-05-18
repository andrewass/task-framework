package com.taskframework.framework.task

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component


@Target(AnnotationTarget.CLASS)
annotation class TaskRunnerComponent(
    @get:AliasFor(annotation = Component::class) val value: String = ""
)