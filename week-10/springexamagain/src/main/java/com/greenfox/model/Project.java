package com.greenfox.model;

/**
 * Created by Andi on 6/18/2017.
 */
public class Project {
  long id;
  String projectname;

  public Project() {
  }

  public Project(long id, String projectname) {
    this.id = id;
    this.projectname = projectname;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getProjectname() {
    return projectname;
  }

  public void setProjectname(String projectname) {
    this.projectname = projectname;
  }
}
