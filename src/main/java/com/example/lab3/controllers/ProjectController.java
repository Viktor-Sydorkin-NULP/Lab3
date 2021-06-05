package com.example.lab3.controllers;

import com.example.lab3.models.Project;
import com.example.lab3.services.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/projects")
@AllArgsConstructor
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/all")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @PostMapping
    public void createProject(@RequestBody Project project) {
        projectService.createProject(project);
    }

    @GetMapping("/{id}")
    public Project findById(@PathVariable long id) {
        return projectService.findById(id);
    }

    @GetMapping("/{projectId}/assign/{developerId}")
    public void assignDeveloperToProject(@PathVariable long projectId, @PathVariable long developerId) {
        projectService.assignDeveloperToProject(projectId, developerId);
    }

    @GetMapping("/{id}/cost")
    public long calculateCostOfProject(@PathVariable long id) {
        return projectService.calculateCostOfProject(id);
    }


}
