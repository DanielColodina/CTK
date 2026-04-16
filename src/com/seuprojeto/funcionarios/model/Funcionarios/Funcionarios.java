package com.seuprojeto.funcionarios.model.Funcionarios;

public class Funcionarios  {

    private Long id;
    private String nome;
    private String usuarios;
    private String senha;

    // ID
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // NOME
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // USUARIOS
    public String getUsuarios() {
        return this.usuarios;
    }
    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    // SENHA
    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String senha) {
        this.senha =  senha;
    }
}
