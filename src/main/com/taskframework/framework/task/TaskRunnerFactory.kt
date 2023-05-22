package com.taskframework.framework.task

interface TaskRunnerFactory {

    fun getTaskRunner(taskName: String): TaskRunner<Task>
}