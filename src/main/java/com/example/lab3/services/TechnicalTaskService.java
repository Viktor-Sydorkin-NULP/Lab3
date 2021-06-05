package com.example.lab3.services;

import com.example.lab3.models.TechnicalTask;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnicalTaskService {
    private List<TechnicalTask> technicalTaskList = new ArrayList<>();

    public void createTechnicalTask(TechnicalTask technicalTask){
        this.technicalTaskList.add(technicalTask);
    }
}
