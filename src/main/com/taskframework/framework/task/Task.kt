package com.taskframework.framework.task

import com.taskframework.framework.subtask.SubTask


abstract class Task {

    protected var taskStatus: TaskStatus = TaskStatus.CREATED

    protected val subTasks: List<SubTask> = mutableListOf()
}