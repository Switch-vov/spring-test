package com.switchvov.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author switch
 * @since 2020/2/4
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class EventTest {
    @Autowired
    private MyEvent event;

    @Autowired
    private MyPublisher publisher;

    @Test
    public void test() {
        publisher.publishEvent(event);
    }
}
