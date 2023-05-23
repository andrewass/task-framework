package com.taskframework.framework.task.subtask

interface SubtaskRunner<T : Subtask> {

    fun run(subtask: T): Pair<T?, SubtaskStatus>

}