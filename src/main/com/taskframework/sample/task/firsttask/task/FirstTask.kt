package com.taskframework.sample.task.firsttask.task

import com.taskframework.framework.task.TaskRunner
import com.taskframework.sample.task.common.task.CustomTask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import org.springframework.stereotype.Component

@Entity(name = "FIRST_TASK")
@DiscriminatorValue("FIRST_TASK")
class FirstTask(
    personId: Long
) : CustomTask(
    personId = personId
)


@Component
class FirstTaskRunner() : TaskRunner(){



}