package com.taskframework.framework.task


interface TaskRunner<T : Task> {

    fun run(task: T)
}