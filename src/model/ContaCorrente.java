package model;

public class ContaCorrente {

    private double agencia;
    private String senha;

    public ContaCorrente(double agencia, String senha) {
        this.agencia = agencia;
        this.senha = senha;
    }

    public double getAgencia() {
        return agencia;
    }

    public String getSenha() {
        return senha;
    }
    
}
