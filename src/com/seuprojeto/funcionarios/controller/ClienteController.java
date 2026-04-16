package com.seuprojeto.funcionarios.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;
import com.seuprojeto.funcionarios.model.Clientes.Cliente;
import com.seuprojeto.funcionarios.dao.Clientes.DAOClientes;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private DAOClientes dao = new DAOClientes();

    @PostMapping
    public String salvar(@RequestBody Cliente cliente) {

        String senhaCriptografada = BCrypt.hashpw(cliente.getSenha(), BCrypt.gensalt());
        cliente.setSenha(senhaCriptografada);

        dao.adicionaClientes(cliente);

        return "Cliente salvo com segurança!";

    }
    @GetMapping
    public List<Cliente> listar() {
        return dao.getListaClientes();
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        dao.removeClientes(id);
        return "Cliente Removido";
    }



}