package primeiroLote.exer01;

import java.util.ArrayList;

public class OutOfMemoryError01 {

	public static void main(String[] args) {

		System.out.println("Programa 01 ");

		ArrayList<Pessoa> pessoas = new ArrayList<>();

		for (int i = 0; i < 100000000; i++) {

			Pessoa pessoa = new Pessoa("" + i, i);

			pessoas.add(pessoa);

			System.out.println(pessoas.get(i));

		}

	}

	static class Pessoa {

		String nome;
		int idade;

		public Pessoa(String nome, int idade) {
			super();
			this.nome = nome;
			this.idade = idade;
		}

		@Override
		public String toString() {
			return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
		}

	}

}
