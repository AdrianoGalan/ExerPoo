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
		int diaNas;
		int mesNas;
		int anoNas;
		
		System.out.println("** Criar novo Aluno **");
		System.out.println("Digite o nome: ");
		nome = scan.nextLine();

		System.out.println("Digite o ra: ");
		ra = scan.nextLine();
		
		System.out.println("Digite o dia nascimento: ");
		diaNas = scan.nextInt();

		System.out.println("Digite o mes nascimento: ");
		mesNas = scan.nextInt();
		
		System.out.println("Digite o ano nascimento: ");
		anoNas = scan.nextInt();
		
		Date nas = new Date(anoNas, mesNas, diaNas);
		
		Aluno aluno = new Aluno(indice, nome, ra, nas);
		alunos[indice] = aluno;
		
		indice++;
			
	}

}
