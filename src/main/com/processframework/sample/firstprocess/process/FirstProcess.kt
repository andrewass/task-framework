package com.processframework.sample.firstprocess.process

import com.processframework.sample.common.CustomProcess
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity(name = "FIRST_PROCESS")
@DiscriminatorValue("FIRST_PROCESS")
class FirstProcess(
    personId: Long
) : CustomProcess(
    personId = personId
)