package primeiroLote.exer03;

import java.util.Date;
import java.util.Scanner;

public class GestaoAlunos {

	private int indice;
	private Aluno[] alunos;
	private Scanner scan;

	public GestaoAlunos() {

		this.indice = 0;
		this.alunos = new Aluno[50];

		this.scan = new Scanner(System.in);
	}

	public void criar() {

		String nome;
		String ra;

		System.out.println("** Criar novo Aluno **");
		System.out.println("Digite o nome: ");
		nome = scan.nextLine();

		System.out.println("Digite o ra: ");
		ra = scan.nextLine();

		this.alunos[indice] = new Aluno(indice, nome, ra, nascimento());

		indice++;

	}

	public void exibir() {

		String ra;
		boolean flag = false;

		System.out.println("** Exibir Aluno **");

		System.out.println("Digite um Ra");
		ra = scan.nextLine();

		for (int i = 0; i < indice; i++) {

			if (alunos[i].getRa().equalsIgnoreCase(ra)) {

				alunos[i].exibir();
				flag = true;
				break;
			}

		}

		if (!flag) {
			System.out.println("Aluno não encontrado");
		}

	}

	public void excluir() {

		String ra;
		boolean flag = false;

		System.out.println("** Excluir Aluno **");

		System.out.println("Digite um Ra");
		ra = scan.nextLine();

		for (int i = 0; i < indice; i++) {

			if (alunos[i].getRa().equalsIgnoreCase(ra)) {

				flag = true;

			}

			if (flag) {

				alunos[i] = alunos[i + 1];

			}

		}

		if (!flag) {
			System.out.println("Aluno não encontrado");
		}

		indice--;

	}

	public void atualizar() {

		
		String ra;
		boolean flag = false;

		System.out.println("** Atualizar Aluno **");

		System.out.println("Digite um Ra");
		ra = scan.nextLine();

		for (int i = 0; i < indice; i++) {

			if (alunos[i].getRa().equalsIgnoreCase(ra)) {

				System.out.println("Digite nome:");
				alunos[i].setNome(scan.nextLine());

			    alunos[i].setNascimento(nascimento());

				flag = true;
				break;
			}

		}

		if (!flag) {
			System.out.println("Aluno não encontrado");
		}

	}

	public void menu() {

		String flag = "f";

		while (!flag.equalsIgnoreCase("s")) {

			System.out.println("** Gestão de alunos**");
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

	private Date nascimento() {

		int diaNas;
		int mesNas;
		int anoNas;

		System.out.println("Digite o dia nascimento: ");
		diaNas = lerInteiro();

		System.out.println("Digite o mes nascimento: ");
		mesNas = lerInteiro();

		System.out.println("Digite o ano nascimento: ");
		anoNas = lerInteiro();

		return new Date(anoNas, mesNas, diaNas);

	}
}
