package com.seuprojeto.funcionarios.dao.Clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.seuprojeto.funcionarios.connection.ConnectionFuncionario;
import com.seuprojeto.funcionarios.model.Clientes.Clientes;

public class DAOClientes extends Clientes {

    private Connection connection;

    public DAOClientes() {
        this.connection = new ConnectionFuncionario().getConnection();
    }


    public void adicionaClientes(Clientes clientes) {

        String sql = "INSERT INTO clientes (nome, numero, enderecoObra, cpf, senha )" +
                "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, clientes.getNome());
            stmt.setLong(2, clientes.getNumero());
            stmt.setString(3, clientes.getEnderecoObra());
            stmt.setLong(4, clientes.getCpf());
            stmt.setString(5, clientes.getSenha());


            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
    }

    //Trazendo a lista de Clientes

    public List<Clientes> getListaClientes() {

        List<Clientes> clientes = new ArrayList<>();

        String sql = "SELECT * FROM clientes";

        try (PreparedStatement stmt = this.connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()){


            while(rs.next()) {
                Clientes cliente = new Clientes();

                cliente.setId(rs.getLong("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setNumero(rs.getLong("numero"));
                cliente.setEnderecoObra(rs.getString("enderecoobra"));
                cliente.setCpf(rs.getLong("cpf"));
                cliente.setSenha(rs.getString("senha"));

                clientes.add(cliente);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public void AlteraClientes(Clientes clientes) {
        String sql = "UPDATE clientes set nome=?, numero=?," +
                " enderecoobra=?, cpf=? ";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, clientes.getId());
            stmt.setString(2, clientes.getNome());
            stmt.setLong(3, clientes.getNumero());
            stmt.setString(4, clientes.getEnderecoObra());
            stmt.setLong(5, clientes.getCpf());
            stmt.setString(6, clientes.getSenha());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
    }

    // Remover
    public void removeCLientes(Clientes clientes) {

        String sql = "DELETE FROM clientes WHERE id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, clientes.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
