package com.taskframework.sample.common.repository

import com.taskframework.sample.common.task.CustomTask
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskJpaRepository : JpaRepository<CustomTask, Long>