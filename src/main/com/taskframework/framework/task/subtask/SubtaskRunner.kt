package com.taskframework.framework.task.subtask

interface SubtaskRunner<T : Subtask> {

    fun runSubtask(subtask: T): T?

}