package com.taskframework.sample.utils

import com.taskframework.framework.task.subtask.SubTaskRunner

interface SubTaskRunnerFactory {

        fun getSubTaskRunner(subTaskName: String) : SubTaskRunner
}