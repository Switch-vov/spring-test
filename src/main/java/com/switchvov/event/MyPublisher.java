package com.switchvov.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author switch
 * @since 2020/2/4
 */
@Component
public class MyPublisher implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void publishEvent(MyEvent event) {
        System.out.println("into My Publisher's method");
        applicationContext.publishEvent(event);
    }
}
