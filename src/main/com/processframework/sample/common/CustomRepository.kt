package com.processframework.sample.common

import com.processframework.framework.process.Process
import com.processframework.framework.process.ProcessRepository
import org.springframework.stereotype.Repository

@Repository
class CustomRepository : ProcessRepository {

    override fun save(process: Process) {
        TODO("Not yet implemented")
    }

    override fun getAll(): Collection<Process> {
        TODO("Not yet implemented")
    }
}