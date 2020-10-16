package primeiroLote.exer05;

import java.util.Date;
import java.util.Scanner;


public class GestaoFuncionarios {

	private int indice;
	private Funcionario[] funcionarios;
	private Scanner scan;

	public GestaoFuncionarios() {

		this.indice = 0;
		this.funcionarios = new Funcionario[50];

		this.scan = new Scanner(System.in);
	}

	public void criar() {

		String nome;
		String matricula;
		float salario;
		String homatriculario;

		System.out.println("** Criar novo funcionario **");
		System.out.println("Digite o nome: ");
		nome = scan.nextLine();

		System.out.println("Digite a matricula: ");
		matricula = scan.nextLine();

		System.out.println("Digite o Salario: ");
		salario = lerFloat();
		
		System.out.println("Digite o Homatriculario: ");
		homatriculario = scan.nextLine();

		this.funcionarios[indice] = new Funcionario(indice, nome, matricula, data("Data Admissão"),
				data("Data Demissão"), salario, homatriculario);

		indice++;

	}

	public void exibir() {

		String matricula;
		boolean flag = false;

		System.out.println("** Exibir Funcionario **");

		System.out.println("Digite uma Matricula");
		matricula = scan.nextLine();

		for (int i = 0; i < indice; i++) {

			if (funcionarios[i].getMatricula().equalsIgnoreCase(matricula)) {

				funcionarios[i].exibir();
				flag = true;
				break;
			}

		}

		if (!flag) {
			System.out.println("Funcionario não encontmatriculado");
		}

	}

	public void excluir() {

		String matricula;
		boolean flag = false;

		System.out.println("** Excluir Funcionario **");

		System.out.println("Digite um matricula");
		matricula = scan.nextLine();

		for (int i = 0; i < indice; i++) {

			if (funcionarios[i].getMatricula().equalsIgnoreCase(matricula)) {

				flag = true;

			}

			if (flag) {

				funcionarios[i] = funcionarios[i + 1];

			}

		}

		if (!flag) {
			System.out.println("funcionario não encontmatriculado");
		}

		indice--;

	}

	public void atualizar() {

		String matricula;
		boolean flag = false;

		System.out.println("** Atualizar funcionario **");

		System.out.println("Digite um matricula");
		matricula = scan.nextLine();

		for (int i = 0; i < indice; i++) {

			if (funcionarios[i].getMatricula().equalsIgnoreCase(matricula)) {

				System.out.println("Digite nome:");
				funcionarios[i].setNome(scan.nextLine());

				funcionarios[i].setAdmissao(data("Digite a data da Admissao"));
				funcionarios[i].setDemissao(data("Digite a data da Demissão"));

				flag = true;
				break;
			}

		}

		if (!flag) {
			System.out.println("funcionario não encontmatriculado");
		}

	}

	public void menu() {

		String flag = "f";

		while (!flag.equalsIgnoreCase("s")) {

			System.out.println("** Gestão de funcionarios**");
			System.out.println("Menu:");
			System.out.println("(C)riar, (E)xibir, (R)emover,(A)tualizar,(S)air");
			flag = scan.nextLine().toUpperCase();

			switch (flag) {
			case "C":
				criar();
				break;
			case "E":
				exibir();
				break;
			case "R":
				excluir();
				break;
			case "A":
				atualizar();
				break;
			case "S":
				System.out.println("Saindo ...");
				break;

			default:
				System.out.println("Opção invalida");
				break;
			}

		}

	}

	private int lerInteiro() {
		String digitado = "";

		digitado = scan.nextLine();

		return Integer.parseInt(digitado);
	}

	private float lerFloat() {
		String digitado = "";

		digitado = scan.nextLine();

		return Float.parseFloat(digitado);
	}

	private Date data(String msg) {

		int dia;
		int mes;
		int ano;

		System.out.println(msg);

		System.out.println("Digite o dia: ");
		dia = lerInteiro();

		System.out.println("Digite o mes: ");
		mes = lerInteiro();

		System.out.println("Digite o ano: ");
		ano = lerInteiro();

		return new Date(ano, mes, dia);

	}

}
