package com.mueble.demo.service;

import com.mueble.demo.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteSer {
    public Cliente actualizar(Cliente cliente);
    public Cliente registrar(Cliente cliente);
    public void eliminar(Cliente cliente);
    public List<Cliente>ver();
}
