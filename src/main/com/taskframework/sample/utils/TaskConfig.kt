package com.taskframework.sample.utils

import org.springframework.beans.factory.FactoryBean
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TaskConfig {

    @Bean
    fun getServiceLocaterFactoryBean(): FactoryBean<*> {
        val factoryBean = ServiceLocatorFactoryBean()
        factoryBean.setServiceLocatorInterface(SubTaskRunnerFactory::class.java)
        return factoryBean
    }
}