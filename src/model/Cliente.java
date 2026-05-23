package model;

public class Cliente {
    private String nome;
    private String CPF;
    private String senha;

    public Cliente(String nome, String CPF, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getSenha() {
        return senha;
    }
}

