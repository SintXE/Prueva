package com.mueble.demo.service;

import com.mueble.demo.entity.Almacen;
import com.mueble.demo.repository.AlmacenRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class AlmacenImpl implements AlmacenSer{

    private final AlmacenRepo almacenRepo;

    @Override
    public Almacen actualizar(Long id, Almacen actualizar) {
        Almacen buscado = almacenRepo.findById(id).get();
        buscado.setClase(buscado.getClase());
        buscado.setCodigo(buscado.getCodigo());
        buscado.setTipo(buscado.getTipo());
        buscado.setModelo(buscado.getModelo());
        return almacenRepo.save(buscado);
    }

    @Override
    public Almacen actualizar(Almacen almacen) {
        return almacenRepo.save(almacen);
    }

    @Override
    public Almacen registrar(Almacen almacen) {
        return almacenRepo.save(almacen);
    }

    @Override
    public boolean eliminar(Long id) {
    try {
        almacenRepo.deleteById(id);
        return true;
    } catch (Exception e) {
        return false;
    }
   }

    @Override
    public List<Almacen> ver() {
        return almacenRepo.findAll();
    }

}
