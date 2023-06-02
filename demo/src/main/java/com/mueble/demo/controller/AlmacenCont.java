package com.mueble.demo.controller;

import com.mueble.demo.entity.Almacen;
import com.mueble.demo.service.AlmacenSer;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deposito")
@RequiredArgsConstructor
public class AlmacenCont {
    private final AlmacenSer almacenSer;

    @GetMapping
    public List<Almacen>ver(){
        return almacenSer.ver();
    }

    @PostMapping
    public ResponseEntity actualizar(@PathVariable("id") Long idAlmacen, @RequestBody Almacen almacen){
        return new ResponseEntity(almacenSer.actualizar(idAlmacen, almacen), HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity registar(@RequestBody Almacen almacen){
        return new ResponseEntity(almacenSer.registrar(almacen),HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity eliminar(@PathVariable("id") Long idAlmacen){
        boolean respuesta = almacenSer.eliminar(idAlmacen);
        if (respuesta == true){
            return new ResponseEntity(HttpStatus.OK);
    }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
