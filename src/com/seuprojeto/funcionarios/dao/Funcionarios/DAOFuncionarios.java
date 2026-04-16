package com.seuprojeto.funcionarios.dao.Funcionarios;


import com.seuprojeto.funcionarios.connection.ConnectionFactory;
import com.seuprojeto.funcionarios.model.Funcionarios.Funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOFuncionarios {

    private Connection connection;


    //Adicionando Funcaionarios
    public DAOFuncionarios() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionaFuncionario(Funcionarios funcionario) {

        String sql = "INSERT INTO funcionarios (nome, usuarios, senha) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getUsuarios());
            stmt.setString(3, funcionario.getSenha());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Trazendo a sua Lista de Funcionarios
    public List<Funcionarios> getLista() {

        List<Funcionarios> funcionarios = new ArrayList<>();

        String sql = "SELECT * FROM funcionarios";

        try (PreparedStatement stmt = this.connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Funcionarios funcionario = new Funcionarios();

                funcionario.setId(rs.getLong("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setUsuarios(rs.getString("usuarios"));
                funcionario.setSenha(rs.getString("senha"));

                funcionarios.add(funcionario);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return funcionarios;
    }

    public void altera(Funcionarios funcionarios) {

        String sql = "UPDATE funcionarios SET nome=?," +
                " usuarios=?, senha=? where id=? ";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1,funcionarios.getNome());
            stmt.setString(2, funcionarios.getUsuarios());
            stmt.setString(3, funcionarios.getSenha());
            stmt.setLong(4,funcionarios.getId());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }

    //Remoção
    public void removeFuncionario(Funcionarios funcionarios) {

        String sql = "DELETE FROM funcionarios WHERE id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, funcionarios.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}