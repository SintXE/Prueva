package com.mueble.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "proveedor")
@Entity(name = "Proveedor")
public class Proveedor {

    @Id
    private String codigo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String lugarProd;
    private String tipoProd;

    public Proveedor(){}

    public Proveedor(String codigo, String nombre, String apellido, String telefono, String lugarProd, String tipoProd){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.lugarProd = lugarProd;
        this.tipoProd = tipoProd;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLugarProd() {
        return lugarProd;
    }

    public void setLugarProd(String lugarProd) {
        this.lugarProd = lugarProd;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }
}
