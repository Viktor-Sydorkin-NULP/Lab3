package com.example.lab3.services;

import com.example.lab3.models.Bill;
import com.example.lab3.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    @Autowired
    private ProjectService projectService;

    public Bill showBill(long projectId) {
        Project project = projectService.findById(projectId);
        long costOfProject = projectService.calculateCostOfProject(projectId);

        return new Bill(costOfProject, project);
    }
}
