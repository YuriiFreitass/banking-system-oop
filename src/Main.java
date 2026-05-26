import model.Cliente;
import model.Conta;
import service.BancoService;

public class Main {
public static void main(String[] args) {
		BancoService bradesco = new BancoService();

		Cliente cliente1 = new Cliente("Francisco", "xxx.xxx.xxx-xx", "JibY@478");
		Cliente cliente2 = new Cliente("Maria", "xxx.xxx.xxx-xx", "GoPbwe4782");

		Conta conta1 = new Conta(47801, cliente1, 850, 5521);
		Conta conta2 = new Conta(55021, cliente2, 1500, 2278);

		bradesco.cadastrarConta(conta1);
		bradesco.cadastrarConta(conta2);

		conta1.depositar(500);
		conta2.depositar(55);

		bradesco.transferir(conta2, conta1, 50);

		Conta contaEncontrada = bradesco.buscarConta(5521);

		if (contaEncontrada != null) {
			System.out.println("Conta encontrada!");
			System.out.println("Titular: " + contaEncontrada.getTitular().getNome());
		}

	}
}
