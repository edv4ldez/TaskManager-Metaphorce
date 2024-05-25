package com.metaphorce.model;

public class Task {
    private int idTarea;
    private String nombre;
    private String descripcion;
    private String prioridad;
    private boolean completado;

    public Task(int idTarea, boolean completado, String prioridad, String descripcion, String nombre) {
        this.idTarea = idTarea;
        this.completado = completado;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
