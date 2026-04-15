package com.seuprojeto.funcionarios.dao.Clientes;

import java.util.Scanner;
public class AdicionarCliente {


    Cliente cliente = new Cliente();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DAOClientes daoClientes = new DAOClientes();

        System.out.println("------------------ADICIONAR CLIENTE------------------");

        System.out.print("Qual o nome do CLiente - ");
        daoClientes.setNome(sc.nextLine());

        System.out.print("Defina a senha do Cliente - ");
        daoClientes.setSenha(sc.nextLine());

        System.out.print("Qual o numero do Cliente - ");
        daoClientes.setNumero(sc.nextLong());
        sc.nextLine();

        System.out.print("Qual o endereco da Obra - ");
        daoClientes.setEnderecoObra(sc.nextLine());

        System.out.print("Qual o cpf(IDENTIFIÇÃO) - ");
        daoClientes.setCpf(sc.nextLong());

        daoClientes.adicionaClientes(Cliente cliente);
        System.out.println("------------------CLIENTE GRAVADO NO BANCO DE DADOS------------------");
    }
}
