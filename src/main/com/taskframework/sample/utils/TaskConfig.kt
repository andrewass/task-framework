package com.taskframework.sample.utils

import com.taskframework.framework.task.TaskRunnerFactory
import com.taskframework.framework.task.subtask.SubtaskRunnerFactory
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

    @Bean("subtaskRunnerFactory")
    fun getServiceLocaterFactoryBeanSubtask(): FactoryBean<*> {
        val factoryBean = ServiceLocatorFactoryBean()
        factoryBean.setServiceLocatorInterface(SubtaskRunnerFactory::class.java)
        return factoryBean
    }


}