package com.seuprojeto.funcionarios.model.Obras;

import com.seuprojeto.funcionarios.model.Funcionarios.Funcionarios;
public class Obras extends Funcionarios{

    private String nomeObra;
    private String Endereco;
    private int cep;


    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getNomeObra() {
        return nomeObra;
    }

    public void setNomeObra(String nomeObra) {
        this.nomeObra = nomeObra;
    }
}
