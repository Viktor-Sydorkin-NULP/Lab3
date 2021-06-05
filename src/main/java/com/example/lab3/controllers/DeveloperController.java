package com.example.lab3.controllers;

import com.example.lab3.models.Developer;
import com.example.lab3.services.DeveloperService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/developers")
@AllArgsConstructor
public class DeveloperController {
    private DeveloperService developerService;

    @GetMapping("/all")
    public List<Developer> getAllDevelopers() {
        return developerService.getAllDevelopers();
    }

    @PostMapping
    public void saveDeveloper(@RequestBody Developer developer) {
        developerService.saveDeveloper(developer);
    }

    @GetMapping("/{id}")
    public Developer findById(@PathVariable long id) {
        return developerService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDeveloper(@PathVariable long id) {
        developerService.deleteDeveloper(id);
    }

    @PutMapping("/{id}")
    public void updateDeveloper(@PathVariable long id, @RequestBody Developer newDeveloper) {
        developerService.updateDeveloper(id, newDeveloper);
    }

    @GetMapping("/{id}/logWork")
    public void logWork(@PathVariable long id, @RequestParam int hours) {
        developerService.logWork(id, hours);
    }
}
