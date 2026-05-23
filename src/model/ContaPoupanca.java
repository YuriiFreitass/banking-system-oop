package model;

public class ContaPoupanca extends Conta {
    private int rendimentos;
    private int juros;

    public ContaPoupanca(int agencia, Cliente titular, double saldo, int numeroConta,int rendimento, int juros) {
        super(agencia,titular,saldo,numeroConta);
        this.rendimentos = rendimento;
        this.juros = juros;
    }

    public int getRendimentos() {
        return rendimentos;
    }

    public int getJuros() {
        return juros;
    }
}

