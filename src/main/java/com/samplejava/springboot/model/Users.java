package com.samplejava.springboot.model;


import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Table(name = "users")
public class Users implements Serializable {

    @Id
    private Long  userId;

    private String  firstName;

    private String  lastName;

    private String  emailAddress;

    private String  addressLine1;

    private String  addressLine2;

    private String city;

    private String  state;

    private Integer  zipcode;

}