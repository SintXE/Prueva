package com.mueble.demo.controller;

import com.mueble.demo.entity.Cliente;
import com.mueble.demo.service.ClienteSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteCont {

    @Autowired
    ClienteSer clienteSer;

    @GetMapping
    public List<Cliente>ver(){
        return clienteSer.ver();
    }

    @PostMapping
    public Cliente actualizar(@RequestBody Cliente cliente){
        return clienteSer.actualizar(cliente);
    }
    public Cliente registrar(@RequestBody Cliente cliente){
        return clienteSer.registrar(cliente);
    }
    public void eliminar(@RequestBody Cliente cliente){
        clienteSer.eliminar(cliente);
    }
}
