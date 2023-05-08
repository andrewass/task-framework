package com.processframework.framework.task


abstract class Task {

    private var taskStatus: TaskStatus = TaskStatus.CREATED

    fun run() {

    }
}