package com.example.lab3.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    private long id;
    private String firstName;
    private String lastName;
    private int costPerHour;
    private int countOfHours;
}
