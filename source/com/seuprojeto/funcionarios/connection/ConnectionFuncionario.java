package com.seuprojeto.funcionarios.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFuncionario {


    public  Connection getConnection() {

        try  {
            return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/db_biblioteca?useSSL=false&serverTimezone=UTC",
                    "root",
                    "admin"
                    );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
