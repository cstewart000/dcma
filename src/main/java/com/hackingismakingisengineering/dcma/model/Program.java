package com.hackingismakingisengineering.dcma.model;

import net.sf.mpxj.ProjectFile;

public class Program {

    private ProjectFile project;
    private String user;
    private String title;
    private String string;
    private int categoryId;
    private Category category;

    @Override
    public String toString() {
        return "Program{" +
                "project=" + project +
                ", user='" + user + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public Program(ProjectFile project) {
        this.project = project;
        this.string = this.toString();
            }

    public Program(ProjectFile project, String user, String title, int categoryId) {
        this.project = project;
        this.user = user;
        this.title = title;
        this.string = toString();
        this.categoryId = categoryId;

        //this.category = new Category(categoryId);
    }

    public ProjectFile getProject() {
        return project;
    }

    public void setProject(ProjectFile project) {
        this.project = project;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
