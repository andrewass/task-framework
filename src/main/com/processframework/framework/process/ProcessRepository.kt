package com.processframework.framework.process

interface ProcessRepository {
    fun save(process: Process)

    fun getAll(): Collection<Process>
}