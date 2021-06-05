package com.example.lab3.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Project {
    private long id;
    private int daysDuration;
    private List<Developer> developerList;
    private String description;
}
