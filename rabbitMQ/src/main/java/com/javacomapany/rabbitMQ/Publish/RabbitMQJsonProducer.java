package com.javacomapany.rabbitMQ.Publish;

import com.javacomapany.rabbitMQ.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonProducer {

    @Value("${rabbitmq.json.routing.key}")
    String json_routing_key;

    @Value("${rabbitmq.exchange.name}")
    String exchange;

    Logger LOGGER  = LoggerFactory.getLogger(RabbitMQJsonProducer.class);


    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendJsonData(UserDTO userDTO){
        rabbitTemplate.convertAndSend(exchange,json_routing_key,userDTO);
        LOGGER.info("msg send successfully from User producer : '"+userDTO.toString()+"'");
    }
}
