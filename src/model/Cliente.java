package model;

public class Cliente {
    private String nome;
    private double CPF;

    public Cliente(String nome, double CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public double getCPF() {
        return CPF;
    }
}
