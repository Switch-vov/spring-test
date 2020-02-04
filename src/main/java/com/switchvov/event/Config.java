package com.switchvov.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author switch
 * @since 2020/2/4
 */
@Configuration
@ComponentScan(basePackages = "com.switchvov.event")
public class Config {

    @Bean
    public MyEvent myEvent() {
        return new MyEvent("1");
    }

}
