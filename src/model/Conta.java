package model;

import exception.SaldoInsuficienteException;

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
    public void sacar(double valor) {
            if (saldo < valor) {
              throw new SaldoInsuficienteException("Valor insuficiente");
            } else {
                saldo = saldo - valor;
                System.out.println("Saque realizado!");
        }
        System.out.println("Saldo atual: " + saldo);

    }
    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Depósito relizado com sucesso!");
        System.out.println("Saldo atual: "  + saldo);


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
