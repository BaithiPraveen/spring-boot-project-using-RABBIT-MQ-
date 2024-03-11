package com.javacomapany.rabbitMQ.subscriber;

import com.javacomapany.rabbitMQ.Publish.RabbitMQProducer;
import com.javacomapany.rabbitMQ.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {

    Logger LOGGER  = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues ="${rabbitmq.json.queue.name}" )
    public void consume(UserDTO userDTO){
        LOGGER.info("user received successfully from user consumer : '"+userDTO.toString()+"'");
    }
}
