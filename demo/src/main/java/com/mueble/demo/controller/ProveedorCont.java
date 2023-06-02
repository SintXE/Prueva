package com.mueble.demo.controller;

import com.mueble.demo.entity.Proveedor;
import com.mueble.demo.service.ProveedorSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class ProveedorCont {

    @Autowired
    ProveedorSer proveedorSer;

    @GetMapping
    public List<Proveedor>ver(){
        return proveedorSer.ver();
    }

    @PostMapping(value = "/actualizar")
    public Proveedor actualizar(@RequestBody Proveedor proveedor){
        return proveedorSer.actualizar(proveedor);
    }

    @PutMapping
    public Proveedor registrar(@RequestBody Proveedor proveedor){
        return proveedorSer.registrar(proveedor);
    }
    public void eliminar(@RequestBody Proveedor proveedor){
        proveedorSer.eliminar(proveedor);
    }
}
