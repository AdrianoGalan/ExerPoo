package primeiroLote.exer10;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Dicionario dicionario = new Dicionario();
		Scanner scan = new Scanner(System.in);
		String palavra;

		String entrada = "";

		while (!entrada.equals("saIr")) {

			System.out.println("Digite uma palavra  --saIr-- p/ finalizar");
			entrada = scan.nextLine();
			palavra = entrada;

			if (dicionario.consulta(entrada)) {

			} else {
				if (!entrada.equals("saIr")) {
					System.out.println("Digite a definição de " + palavra);
					entrada = scan.nextLine();
					dicionario.adicionar(palavra, entrada);
				}
			}

		}
		;

		System.out.println("Saindo ...");
		System.exit(0);

	}

}
