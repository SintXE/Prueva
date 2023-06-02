package com.mueble.demo.service;

import com.mueble.demo.entity.Cliente;
import com.mueble.demo.repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImpl implements ClienteSer{

    @Autowired
    ClienteRepo clienteRepo;

    @Override
    public Cliente actualizar(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente registrar(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public void eliminar(Cliente cliente) {
        clienteRepo.delete(cliente);
    }

    @Override
    public List<Cliente> ver() {
        return clienteRepo.findAll();
    }
}
