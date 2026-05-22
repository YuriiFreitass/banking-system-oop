package model;

public class Conta {
    private String email;
    private String senha;

    public Conta(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public double getemail() {
        return email;
    }

    public int getSenha() {
        return senha;
    }


}
