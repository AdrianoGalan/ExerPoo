package primeiroLote.exer13;

import java.util.Scanner;

public class Empresa {

	private Rh rh;
	private long id;

	public Empresa() {
		this.id = 1;

		rh = new Rh();
	}

	public Funcionario contratarFuncionario() {

		Funcionario f = new Funcionario();
		Scanner scan = new Scanner(System.in);

		f.setId(this.id);

		System.out.println("Digite o nome do funcionario: ");
		f.setNome(scan.nextLine());

		System.out.println("Digite a Matricula do funcionario: ");
		f.setMatricula(scan.nextLine());

		System.out.println("Digite o salrio do funcionario: ");
		f.setSalario(scan.nextDouble());

		System.out.println("Digite o numero de faltas do funcionario: ");
		f.setFaltasNoAno(scan.nextInt());

		System.out.println("Digite a ultima Nota Avaliacao do funcionario: ");
		f.setUltimaNotaAvaliacao(scan.nextFloat());

		System.out.println("Digite a qtd Premios Recebi dos Ano do funcionario: ");
		f.setQtdPremiosRecebidosAno(scan.nextInt());

		System.out.println("funcionario faz faculdade s-sim/n-não ");

		if (scan.nextLine().equals("s")) {
			f.setGraduado(true);

			System.out.println("Digite o nome da Faculdade do funcionario: ");
			f.setNomeFaculdade(scan.nextLine());

			System.out.println("Digite o nome Curso do funcionario: ");
			f.setNomeCurso(scan.nextLine());

		} else {
			f.setGraduado(false);
		}

		id++;
		return f;

	}

}
