package com.api.SoftU.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Profesores")
public class ProfesorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Profesor")
    private int Id_Profesor;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Especialidad")
    private String Especialidad;
    @Column(name = "FechaDeContratacion")
    private Date FechaDeContratacion;

    public int getId_Profesor() {
        return Id_Profesor;
    }

    public void setId_Profesor(int id_Profesor) {
        Id_Profesor = id_Profesor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public Date getFechaDeContratacion() {
        return FechaDeContratacion;
    }

    public void setFechaDeContratacion(Date fechaDeContratacion) {
        FechaDeContratacion = fechaDeContratacion;
    }
}
