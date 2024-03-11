package com.javacomapany.rabbitMQ.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {

    Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);
    @RabbitListener(queues ="${rabbitmq.queue.name}" )
    public void consumeMessage(String message){
        LOGGER.info("msg received successfully from consumer : '"+message+"'");
    }
}
