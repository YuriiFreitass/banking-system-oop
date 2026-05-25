package service;

import model.Conta;

import java.util.ArrayList;
import java.util.List;

public class BancoService {

	private List<Conta> contas = new ArrayList<>();


	public void CadastrarConta(Conta conta) {
		contas.add(conta);
		System.out.println("Conta cadastrada com sucesso!");
	}

}
