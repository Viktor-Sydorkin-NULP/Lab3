package com.example.lab3.controllers;

import com.example.lab3.models.TechnicalTask;
import com.example.lab3.services.TechnicalTaskService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/technicalTasks")
@AllArgsConstructor
public class TechnicalTaskController {

    @Autowired
    private TechnicalTaskService technicalTaskService;

    @PostMapping
    public void createTechnicalTask(@RequestBody TechnicalTask technicalTask) {
        technicalTaskService.createTechnicalTask(technicalTask);
    }
}
