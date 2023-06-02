package com.mueble.demo.service;

import com.mueble.demo.entity.Proveedor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProveedorSer {

    public Proveedor actualizar(Proveedor proveedor);
    public Proveedor registrar(Proveedor proveedor);
    public void eliminar(Proveedor proveedor);
    public List<Proveedor>ver();
}
