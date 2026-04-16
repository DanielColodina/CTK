package com.seuprojeto.funcionarios.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


    private static final String URL = "jdbc:mysql://localhost:3306/db_biblioteca?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() {

        try  {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro de conexão com banco",e);
        }
    }
}
