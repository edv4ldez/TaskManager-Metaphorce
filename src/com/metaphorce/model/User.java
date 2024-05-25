package com.metaphorce.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private int idUser;
    private String name;
    private String email;
    private List<Task> tasks;

    public User(int idUser, String name, String email) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
