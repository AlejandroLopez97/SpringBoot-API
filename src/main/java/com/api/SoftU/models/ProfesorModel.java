package com.api.SoftU.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Profesores")
public class ProfesorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Profesor")
    private int id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Email")
    private String email;
    @Column(name = "Especialidad")
    private String especialidad;
    @Column(name = "FechaDeContratacion")
    private Date fechaDeCreacion;

    public ProfesorModel() {
    }

    public ProfesorModel(String nombre, String email, String especialidad, Date fechaDeCreacion) {
        this.nombre = nombre;
        this.email = email;
        this.especialidad = especialidad;
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
}
