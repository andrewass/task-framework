package com.taskframework.sample.utils

import com.taskframework.framework.task.TaskRunnerFactory
import com.taskframework.framework.task.subtask.SubTaskRunnerFactory
import org.springframework.beans.factory.FactoryBean
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TaskConfig {

    @Bean("taskRunnerFactory")
    fun getServiceLocaterFactoryBeanTask(): FactoryBean<*> {
        val factoryBean = ServiceLocatorFactoryBean()
        factoryBean.setServiceLocatorInterface(TaskRunnerFactory::class.java)
        return factoryBean
    }

    @Bean("subTaskRunnerFactory")
    fun getServiceLocaterFactoryBeanSubTask(): FactoryBean<*> {
        val factoryBean = ServiceLocatorFactoryBean()
        factoryBean.setServiceLocatorInterface(SubTaskRunnerFactory::class.java)
        return factoryBean
    }


}