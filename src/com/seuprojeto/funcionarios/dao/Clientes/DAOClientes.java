package com.seuprojeto.funcionarios.dao.Clientes;

import java.sql.*;
import java.util.*;

import com.seuprojeto.funcionarios.connection.ConnectionFactory;
import com.seuprojeto.funcionarios.model.Clientes.Cliente;

public class DAOClientes {

    // CREATE
    public void adicionaClientes(Cliente cliente) {

        String sql = "INSERT INTO clientes (nome, numero, enderecoobra, cpf, senha) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setLong(2, cliente.getNumero());
            stmt.setString(3, cliente.getEnderecoObra());
            stmt.setLong(4, cliente.getCpf());
            stmt.setString(5, cliente.getSenha());

            stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // READ
    public List<Cliente> getListaClientes() {

        List<Cliente> lista = new ArrayList<>();

        String sql = "SELECT * FROM clientes";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setId(rs.getLong("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setNumero(rs.getLong("numero"));
                cliente.setEnderecoObra(rs.getString("enderecoobra"));
                cliente.setCpf(rs.getLong("cpf"));
                cliente.setSenha(rs.getString("senha"));

                lista.add(cliente);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }

    // UPDATE
    public void alteraClientes(Cliente cliente) {

        String sql = "UPDATE clientes SET nome=?, numero=?, enderecoobra=?, cpf=?, senha=? WHERE id=?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setLong(2, cliente.getNumero());
            stmt.setString(3, cliente.getEnderecoObra());
            stmt.setLong(4, cliente.getCpf());
            stmt.setString(5, cliente.getSenha());
            stmt.setLong(6, cliente.getId());

            stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // DELETE
    public void removeClientes(Long id) {

        String sql = "DELETE FROM clientes WHERE id=?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);

            stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}