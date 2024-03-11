package com.javacomapany.rabbitMQ.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDTO {

    private Long id;

    private String name;

    private String email;

}
