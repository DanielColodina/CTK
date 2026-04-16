package com.seuprojeto.funcionarios.dao.Funcionarios;
import com.seuprojeto.funcionarios.model.Funcionarios.Funcionarios;

import java.util.Scanner;

public class AlterarFuncionario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DAOFuncionarios daoFuncionarios = new DAOFuncionarios();
        Funcionarios funcionarios = new Funcionarios();



        System.out.println("************************************************************");
        System.out.print("Qual o id que deseja alterar - ");
        funcionarios.setId(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Atualizar Nome  - ");
        funcionarios.setNome(scanner.nextLine());

        System.out.print("Atualizar Usuario  - ");
        funcionarios.setUsuarios(scanner.nextLine());

        System.out.print("Alterar Senha- ");
        funcionarios.setSenha(scanner.nextLine());
        System.out.println("************************************************************");
        daoFuncionarios.altera(funcionarios);

        System.out.println("Funcionario Atualizado!");
    }
}
