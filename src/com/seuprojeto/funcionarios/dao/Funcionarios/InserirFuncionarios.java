package com.seuprojeto.funcionarios.dao.Funcionarios;
import java.util.Scanner;

import com.seuprojeto.funcionarios.model.Funcionarios.Funcionarios;

public class InserirFuncionarios {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionarios funcionarios = new Funcionarios();

        System.out.println("***********************************************");

        System.out.print("Coloque o nome do seu Funcionario: - ");
        funcionarios.setNome(scanner.nextLine());

        System.out.print("Coloque o usuario do seu funcionario: - ");
        funcionarios.setUsuarios(scanner.nextLine());

        System.out.print("Digite qual a seha dele: - ");
        funcionarios.setSenha(scanner.nextLine());

        DAOFuncionarios daofuncionarios = new DAOFuncionarios();
        daofuncionarios.adicionaFuncionario(funcionarios);
        System.out.println("***********************************************");
        System.out.println("Gravando o funcionario...");
        System.out.println("***********************************************");
    }
}
