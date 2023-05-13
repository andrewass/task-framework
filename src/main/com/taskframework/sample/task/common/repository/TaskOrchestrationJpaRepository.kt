package com.taskframework.sample.task.common.repository

import com.taskframework.framework.task.TaskStatus
import com.taskframework.sample.task.common.task.DefaultTask
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskOrchestrationJpaRepository : JpaRepository<DefaultTask, Long> {

    fun findAllByTaskStatusIn(statusList: List<TaskStatus>) : List<DefaultTask>
}