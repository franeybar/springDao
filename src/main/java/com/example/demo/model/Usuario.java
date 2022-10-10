package com.example.demo.model;

public class Usuario {
    private String nombre;
    private String apellido;
    private Long id;

//@Entity

    public Usuario(String nombre, String apellido, Long id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}


