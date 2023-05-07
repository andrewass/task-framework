package com.processframework.sample.common

import com.processframework.framework.process.Process
import com.processframework.framework.process.ProcessRepository
import org.springframework.stereotype.Repository

@Repository
class CustomRepository(
    private val jpaRepository: ProcessJpaRepository
) : ProcessRepository {

    override fun save(process: Process) {
        val response = jpaRepository.save(process as CustomProcess)
        val test = 323
    }

    override fun getAll(): Collection<Process> {
        val response = jpaRepository.findAll()
        return response
    }
}