package com.mueble.demo.service;

import com.mueble.demo.entity.Proveedor;
import com.mueble.demo.repository.ProveedorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorImpl implements ProveedorSer{

    @Autowired
    ProveedorRepo proveedorRepo;

    @Override
    public Proveedor actualizar(Proveedor proveedor) {
        return proveedorRepo.save(proveedor);
    }

    @Override
    public Proveedor registrar(Proveedor proveedor) {
        return proveedorRepo.save(proveedor);
    }

    @Override
    public void eliminar(Proveedor proveedor) {
        proveedorRepo.delete(proveedor);
    }

    @Override
    public List<Proveedor> ver() {
        return proveedorRepo.findAll();
    }
}
