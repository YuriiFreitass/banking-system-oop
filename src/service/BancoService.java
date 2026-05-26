package service;

import model.Conta;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class BancoService {

	private List<Conta> contas = new ArrayList<>();


	public void cadastrarConta(Conta conta) {
		contas.add(conta);
		System.out.println("Conta cadastrada com sucesso!");
	}

	public Conta buscarConta(int numeroConta) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumeroConta() == numeroConta) {
				return contas.get(i);
			}
		}
		return null;
	}

	public void transferir(Conta origem, Conta destino, double valor) {
			origem.sacar(valor);
			destino.depositar((valor));

			System.out.println("Transferência realizada com sucesso!");
		}

	}

