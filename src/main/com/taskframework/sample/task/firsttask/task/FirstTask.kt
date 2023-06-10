package com.taskframework.sample.task.firsttask.task

import com.taskframework.sample.task.common.task.DefaultTask
import com.taskframework.sample.task.firsttask.task.subtasks.FirstSubtask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("FIRST_TASK")
class FirstTask : DefaultTask() {

    init {
        val subTask = FirstSubtask(task = this)
        subtasks.add(subTask)
    }

    override fun run() {
        TODO("Not yet implemented")
    }
}