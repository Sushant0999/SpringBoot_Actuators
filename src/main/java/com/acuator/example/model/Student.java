package com.acuator.example.model;

import lombok.Data;

import java.util.UUID;


@Data
public class Student {
    private UUID uid;
    private String name;
    private String email;
}
