package com.greenfox.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProjectList {
  List<Project> projectList;

  public ProjectList() {
    projectList = new ArrayList<>();
  }


  public ProjectList(List<Project> projectList) {
    this.projectList = projectList;
  }

  public List<Project> getProjectList() {
    return projectList;
  }

  public void setProjectList(List<Project> projectList) {
    this.projectList = projectList;
  }

  public void addProject(Project project) {
    projectList.add(project);
  }
}
