package com.example.spring_sec.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private int id;
    private String name;
    private String tech;
}
