package com.seuprojeto.funcionarios.model.Clientes;

public class Cliente {

    private Long id;
    private String nome;
    private Long numero;
    private String enderecoObra;
    private Long cpf;
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEnderecoObra() {
        return enderecoObra;
    }

    public void setEnderecoObra(String enderecoObra) {
        this.enderecoObra = enderecoObra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}