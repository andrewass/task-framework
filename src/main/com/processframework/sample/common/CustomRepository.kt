package com.processframework.sample.common

import com.processframework.framework.process.Process
import com.processframework.framework.process.ProcessRepository
import org.springframework.stereotype.Repository

@Repository
class CustomRepository(
    private val jpaRepository: ProcessJpaRepository
) : ProcessRepository {

    override fun save(process: Process) {
        jpaRepository.save(process as CustomProcess)
    }

    override fun getAll(): Collection<Process> =
        jpaRepository.findAll()

}