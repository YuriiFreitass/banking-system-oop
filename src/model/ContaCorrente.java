package model;

public class ContaCorrente extends Conta {
    private double limite;
    private double cartao;
    private int taxa;

    public ContaCorrente(int agencia, Cliente titular, double saldo, int numeroConta,double limite, double cartao, int taxa) {
        super(agencia, titular, saldo, numeroConta);
        this.limite = limite;
        this.cartao = cartao;
        this.taxa = taxa;
    }

    public double getLimite() {
        return limite;
    }

    public double getCartao() {
        return cartao;
    }

    public int getTaxa() {
        return taxa;
    }

}
