package com.taskframework.framework.task.subtask

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Component
annotation class SubtaskRunnerComponent(
    @get:AliasFor(annotation = Component::class) val value: String = ""
)

