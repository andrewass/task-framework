package com.taskframework.framework.task.subtask

interface SubtaskRunnerFactory {

    fun getSubtaskRunner(subtaskName: String): SubtaskRunner
}