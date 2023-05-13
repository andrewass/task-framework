package com.taskframework.sample.utils

import com.taskframework.framework.task.TaskRunner

interface TaskRunnerFactory {

    fun getTaskRunner(taskName: String): TaskRunner
}