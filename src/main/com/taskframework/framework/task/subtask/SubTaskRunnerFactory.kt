package com.taskframework.framework.task.subtask

interface SubTaskRunnerFactory {

    fun getSubTaskRunner(subTaskName: String): SubTaskRunner
}