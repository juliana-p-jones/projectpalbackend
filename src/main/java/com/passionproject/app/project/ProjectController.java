package com.passionproject.app.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins= "http://localhost:4200")
@RestController
@RequestMapping(path = "/passionproject")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/project")
    public void createProject(@RequestBody Project project) {
    projectService.createProject(project);
    }

    @GetMapping("/projects")
    public List<Project> getAllProjects(){
        List<Project> customers = projectService.getAllProjects();
        return customers;
    }

    @GetMapping("/project/{id}")
    public Project getProjectById(@PathVariable Long id){
        return projectService.getProjectById(id);
    }

    @PutMapping("/project/{id}")
    public void updateProject(@PathVariable Long id, @RequestBody Project project){
        projectService.updateProject(project, id);
    }

    @DeleteMapping("/project/{id}")
    public void deleteProject(@PathVariable Long id){
        projectService.deleteProject(id);
    }

//    @PostMapping("/project/{id}")
//    public Project getProjectById(@PathVariable Long id){
//        projectService.findById(id);
//    }



}
