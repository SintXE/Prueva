package com.mueble.demo.service;

import com.mueble.demo.entity.Almacen;


import java.util.List;

public interface AlmacenSer {
    Almacen actualizar(Long id,Almacen actualizar);

    Almacen actualizar(Almacen almacen);

    Almacen registrar(Almacen almacen);
    boolean eliminar(Long id);

    List<Almacen>ver();

}
