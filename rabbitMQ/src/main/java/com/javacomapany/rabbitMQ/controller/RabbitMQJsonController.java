package com.javacomapany.rabbitMQ.controller;

import com.javacomapany.rabbitMQ.Publish.RabbitMQJsonProducer;
import com.javacomapany.rabbitMQ.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rabbitmq/json")
public class RabbitMQJsonController {

    @Autowired
    private RabbitMQJsonProducer rabbitMQJsonProducer;

    @PostMapping
    public ResponseEntity<String> sendJsonData(@RequestBody UserDTO userDTO){
        rabbitMQJsonProducer.sendJsonData(userDTO);
        return ResponseEntity.ok("user send successfully from producer : '"+userDTO.toString()+"'");
    }
}
