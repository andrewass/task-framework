package com.taskframework.sample.task.common.repository

import com.taskframework.sample.task.common.task.DefaultTask
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskJpaRepository : JpaRepository<DefaultTask, Long>