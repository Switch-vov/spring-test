package com.switchvov.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author switch
 * @since 2020/2/4
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
        System.out.println("My Event");
    }

    public void print() {
        System.out.println("hello spring event[MyEvent]");
    }
}
