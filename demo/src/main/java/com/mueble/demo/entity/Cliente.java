package com.mueble.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "cliente")
@Entity(name = "Cliente")
public class Cliente {

    @Id
    private String codigo;

    private String nomble;

    private String apellido;

    private String telefono;

    private String DNI;

    public Cliente(){}

    public Cliente(String codigo, String nomble, String apellido, String telefono, String dni) {
        this.codigo = codigo;
        this.nomble = nomble;
        this.apellido = apellido;
        this.telefono = telefono;
        DNI = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomble() {
        return nomble;
    }

    public void setNomble(String nomble) {
        this.nomble = nomble;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
