package com.example.lab3.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bill {
    private long cost;
    private Project project;
}
