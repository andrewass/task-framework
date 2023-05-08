package com.processframework.sample.common.repository

import com.processframework.framework.task.TaskOrchestrationRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskOrchestrationJpaRepository : TaskOrchestrationRepository{
}