package com.processframework.sample.common

import jakarta.persistence.*
import com.processframework.framework.process.Process
import java.util.UUID

@Entity
@Table(name = "PROCESS")
@DiscriminatorColumn(name = "PROCESS_NAME", discriminatorType = DiscriminatorType.STRING)
open class CustomProcess(
    @Id
    @Column(name = "PROCESS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long? = null,

    open val personId: Long? = null
) : Process()
