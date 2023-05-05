package com.processframework.sample.common

import com.processframework.framework.process.Process
import jakarta.persistence.*

@Table(name = "PROCESS")
@Entity(name = "CUSTOM_PROCESS")
@DiscriminatorColumn(name = "PROCESS_NAME", discriminatorType = DiscriminatorType.STRING)
open class CustomProcess(
    @Id
    @Column(name = "PROCESS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long? = null,

    open val personId: Long? = null
) : Process()
