package com.seuprojeto.funcionarios.dao.Funcionarios;

import com.seuprojeto.funcionarios.model.Funcionarios.Funcionarios;
import java.util.Scanner;

public class RemoverFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionarios funcionarios = new Funcionarios();
        DAOFuncionarios daoFuncionarios = new DAOFuncionarios();

        System.out.println("********************************************************************");
        System.out.print("Qual o id do Funcionario que deseja remover - ");
        funcionarios.setId(scanner.nextLong());

        daoFuncionarios.removeFuncionario(funcionarios);

        System.out.println("********************************************************************");
        System.out.println("Funcionario Removido!");

    }

}
