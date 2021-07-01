package com.passionproject.app.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public void createProject(Project project) {
        projectRepository.save(project);
    }

    public List<Project> getAllProjects() {
        List<Project> listOfProjects = new ArrayList<Project>();
        projectRepository.findAll().forEach(listOfProjects::add);
        return listOfProjects;
    }

    public void updateProject(Project project, Long id) {
//        Optional<Project> optionalProject = projectRepository.findById(id);
        project.setId(id);
        projectRepository.save(project);

    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

    public Project getProjectById(Long id) {
       return projectRepository.findById(id).get();
    }

//    public Project getProjectById(Long id) {
//        if (projectRepository.findById(id)) {
//            return projectRepository.findById(id);
//        } else {
//            return null;
//        }
//    }
}
