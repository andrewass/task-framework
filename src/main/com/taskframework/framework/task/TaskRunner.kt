package com.taskframework.framework.task


abstract class TaskRunner {

    fun runTask(task: Task){
        task.run()
    }
}