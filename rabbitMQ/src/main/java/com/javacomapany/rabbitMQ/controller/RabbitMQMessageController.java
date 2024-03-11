package com.javacomapany.rabbitMQ.controller;

import com.javacomapany.rabbitMQ.Publish.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitmq/")
public class RabbitMQMessageController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @GetMapping
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message){
        rabbitMQProducer.sendMessage(message);
        return ResponseEntity.ok("msg send successfully from producer : '"+message+"'");
    }
}
