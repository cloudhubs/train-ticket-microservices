package com.cloudhubs.trainticket.contacts.mq;


import com.cloudhubs.trainticket.contacts.config.Queues;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitSend {

    @Autowired
    private AmqpTemplate rabbitTemplate;
    private static final Logger logger = LoggerFactory.getLogger(RabbitSend.class);

    public void send(String val) {
        logger.info("send info to mq:" + val);
        this.rabbitTemplate.convertAndSend(Queues.queueName, val);
    }

}
