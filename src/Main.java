import model.Cliente;
import model.Conta;

public class Main {
public static void main(String[] args) {
		Cliente titular = new Cliente("Yuri", "07447452364", "444074@");
		Conta conta = new Conta(4758210, titular, 0, 4478);
		conta.depositar(500);
		conta.sacar(200);


	}
}
