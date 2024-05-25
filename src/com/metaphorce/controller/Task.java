package com.metaphorce.controller;

public class Task {
    private int idTarea;
    private String nombre;

    public Task(int idTarea, String nombre) {
        this.idTarea = idTarea;
        this.nombre = nombre;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
