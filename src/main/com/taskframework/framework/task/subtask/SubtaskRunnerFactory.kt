package com.taskframework.framework.task.subtask

interface SubtaskRunnerFactory<T : Subtask> {

    fun getSubtaskRunner(subtaskName: String): SubtaskRunner<T>
}