package com.tr.ext.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author trangle
 */
public class TestApplicationEvent extends ApplicationEvent{


    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public TestApplicationEvent(String source) {
        super(source);
    }
}
