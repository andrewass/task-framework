package com.processframework.sample.common.repository

import com.processframework.sample.common.CustomTask
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskJpaRepository : JpaRepository<CustomTask, Long>