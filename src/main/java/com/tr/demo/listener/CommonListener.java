package com.tr.demo.listener;

import com.tr.demo.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CommonListener {

    private static final Logger logger = LoggerFactory.getLogger(CommonListener.class);

    @EventListener
    @Async
    public void processMessageListener(String message) {
        logger.debug("Event监听器接收到消息：" + message);
    }

    @EventListener
    @Async
    public void processUserListener(User user) {
        logger.debug("Event监听器接收到用户：" + user);
    }

    /**
     * EventListener当参数为Map时好像不生效
     *
     * @param map
     */
    @EventListener
    @Async
    public void processMapListener(Map<String, String> map) {
        logger.debug("Event监听器接收到Map：" + map);
    }
}
