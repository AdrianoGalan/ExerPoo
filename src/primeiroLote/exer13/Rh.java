package primeiroLote.exer13;

import java.util.ArrayList;
import java.util.List;

public class Rh {

	private List<Funcionario> funcionaros;

	public Rh() {

		this.funcionaros = new ArrayList<Funcionario>();

	}

	public double valorBonus(Funcionario funcionario) {
		
		double bonus=0;

		if (funcionario.getFaltasNoAno() < 2) {
			
			bonus = funcionario.getSalario() * 0.3;
			
		} else if (funcionario.getFaltasNoAno() < 4) {
			
			bonus = funcionario.getSalario() * 0.15;

		} else {
			
			bonus = funcionario.getSalario() * 0.05;
		}
		
		return bonus + valorAdicionalBonus(funcionario);

	}
	
	private double valorAdicionalBonus(Funcionario funcionario) {
		
		if(funcionario.getUltimaNotaAvaliacao() > 7) {
			return funcionario.getSalario() * 0.3;
		}else if(funcionario.getUltimaNotaAvaliacao() >= 5) {
			return funcionario.getSalario() * 0.15;
		}else {
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
