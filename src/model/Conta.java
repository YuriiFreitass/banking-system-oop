package model;

public class Conta {
    private int agencia;
    private Cliente titular;
    private double saldo;
    private int numeroConta;


    public Conta(int agencia,Cliente titular, double saldo, int numeroConta) {
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }


    public int getAgencia() {
        return agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
