package com.greenfox.model;

public class Project {
  long id;
  String nameOfProject;

  public Project() {
  }

  public Project(long id, String nameOfProject) {
    this.id = id;
    this.nameOfProject = nameOfProject;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getProjectname() {
    return nameOfProject;
  }

  public void setProjectname(String nameOfProject) {
    this.nameOfProject = nameOfProject;
  }
}
