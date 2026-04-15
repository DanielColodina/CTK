package com.seuprojeto.funcionarios.controller;

import org.springframework.web.bind.annotation.*;
import com.seuprojeto.funcionarios.model.Clientes.Clientes;
import com.seuprojeto.funcionarios.dao.Clientes.DAOClientes;

@RestController
@ResquestMapping("/clientes")
public class ClienteController {

    private DAOClientes dao = new DAOClientes();

    @PostMapping
    public String adicionarCliente(@RequestBody Cliente cliente) {

        dao.adicionaClientes(cliente);

     return "Cliente salvo com sucesso!";

    }
}


