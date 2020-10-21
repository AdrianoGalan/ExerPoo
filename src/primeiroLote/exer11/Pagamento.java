package primeiroLote.exer11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {

		Map<Character, FormaPagamento> tipoPagamento = new HashMap<Character, FormaPagamento>();
		Scanner scan = new Scanner(System.in);
		String entrada = "";
		Character chave = new Character('r');
		double valor = 0;

		FormaPagamento fp1 = new FormaPagamento("Dinheiro", " em dinheiro");
		FormaPagamento fp2 = new FormaPagamento("Cartão Debito", " em cartão de débito");
		FormaPagamento fp3 = new FormaPagamento("Cartão de Crédito", " do limite do cartão de crédito");
		FormaPagamento fp4 = new FormaPagamento("Cheque", " em cheque");
		FormaPagamento fp5 = new FormaPagamento("Depósito", " em deposito bancario");

		tipoPagamento.put('a', fp1);
		tipoPagamento.put('b', fp2);
		tipoPagamento.put('c', fp3);
		tipoPagamento.put('d', fp4);
		tipoPagamento.put('e', fp5);

		do {
			System.out.println("Digite o valor ");
			valor = lerDouble(scan);
			System.out.println("Digite a forma de pagamento ");
			chave = scan.nextLine().charAt(0);
			if (tipoPagamento.containsKey(chave)) {
				System.out.println("Pago R$: " + valor + tipoPagamento.get(chave).getDescricao());
			} else {
				System.out.println("Tipo de pagamento invalido: ");
			}

			System.out.println("Digite s-sair / c-continuar");
			entrada = scan.nextLine();

		} while (!entrada.equals("s"));

		System.out.println("saindo ....");
		System.exit(0);

	}

	private static double lerDouble(Scanner scan) {

		String digitado = "";

		digitado = scan.nextLine();

		return Double.parseDouble(digitado);
	}

	static class FormaPagamento {

		private String tipo;
		private String descricao;

		public FormaPagamento(String tipo, String descricao) {

			this.tipo = tipo;
			this.descricao = descricao;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

	}

}
