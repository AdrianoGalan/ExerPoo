package primeiroLote.exer12;

import java.util.ArrayList;
import java.util.List;

public class Rh {

	private List<Funcionario> funcionaros;

	public Rh() {

		this.funcionaros = new ArrayList<Funcionario>();

	}

	public double valorBonus(Funcionario funcionario) {

		if (funcionario.getFaltasNoAno() < 2) {
			return funcionario.getSalario() * 0.3;
		} else if (funcionario.getFaltasNoAno() < 4) {
			return funcionario.getSalario() * 0.15;

		} else {
			return funcionario.getSalario() * 0.05;
		}

	}

	public void mostraBonusTodosFuncionarios() {

		for (Funcionario funcionario : this.funcionaros) {
			System.out.println(funcionario.getNome() + " Bonus de R$:" + valorBonus(funcionario));
		}

	}

	public void adicionarFuncionario(Funcionario f) {

		if (this.funcionaros.add(f)) {
			System.out.println("Funcionaro adicionado");
		} else {
			System.out.println("Erro ao adicionar");
		}

	}

	public void removerFuncionario(Funcionario f) {

		if (this.funcionaros.remove(f)) {
			System.out.println("Funcionario removido");
		} else {
			System.out.println("Erro ao remover");
		}

	}
}
