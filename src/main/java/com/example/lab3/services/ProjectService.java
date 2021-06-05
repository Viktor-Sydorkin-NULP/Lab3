package com.example.lab3.services;

import com.example.lab3.models.Developer;
import com.example.lab3.models.Project;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProjectService {
    private static List<Project> projectList = new ArrayList<>();

    static {
        projectList.add(new Project(1L, 365, new ArrayList<>(), "Fun project!"));
        projectList.add(new Project(2L, 300, new ArrayList<>(), "Test project!"));
        projectList.add(new Project(3L, 365, new ArrayList<>(), "Fake project!"));
    }

    @Autowired
    private DeveloperService developerService;

    public List<Project> getAllProjects() {
        return projectList;
    }

    public void createProject(Project project) {
        this.projectList.add(project);
    }

    public void assignDeveloperToProject(long projectId, long developerId) {
        Project project = findById(projectId);
        Developer developer = developerService.findById(developerId);
        project.getDeveloperList().add(developer);
    }

    public Project findById(long id) {
        return projectList.stream()
            .filter(p -> p.getId() == id)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Project not found"));
    }

    public long calculateCostOfProject(long projectId) {
        Project project = findById(projectId);
        List<Developer> developerList = project.getDeveloperList();
        int daysDuration = project.getDaysDuration();
        long cost = 0;
        for (Developer developer : developerList) {
            cost += developer.getCostPerHour() * 8 * daysDuration;
        }
        return cost;
    }
}
