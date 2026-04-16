package com.seuprojeto.funcionarios.dao.Funcionarios;

import com.seuprojeto.funcionarios.model.Funcionarios.Funcionarios;


import java.util.List;

public class ListaFuncionarios {

    public static void main(String []args) {

        DAOFuncionarios funcionario = new DAOFuncionarios();
        List<Funcionarios> funcionariosList = funcionario.getLista();

        for( Funcionarios funcionarios : funcionariosList) {
            System.out.println("********************************************************************");
            System.out.println("NOME - " + funcionarios.getNome());
            System.out.println("USUARIO - " + funcionarios.getUsuarios());
            System.out.println("SENHA  - " + funcionarios.getSenha());

        }
        System.out.println("********************************************************************");
    }
}
