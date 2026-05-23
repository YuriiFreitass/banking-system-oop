package model;

public class Cliente {
    private String nome;
    private double CPF;
    private String senha;

    public Cliente(String nome, double CPF, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public double getCPF() {
        return CPF;
    }

    public String getSenha() {
        return senha;
    }
}

