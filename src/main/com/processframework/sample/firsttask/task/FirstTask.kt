package com.processframework.sample.firsttask.task

import com.processframework.sample.common.CustomTask
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity(name = "FIRST_TASK")
@DiscriminatorValue("FIRST_TASK")
class FirstTask(
    personId: Long
) : CustomTask(
    personId = personId
)