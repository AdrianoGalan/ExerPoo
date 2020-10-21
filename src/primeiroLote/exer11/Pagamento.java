package primeiroLote.exer11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {

		Map<String, String> tipoPagamento = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		String entrada = "";
		double valor = 0;

		tipoPagamento.put("Dinheiro", " em dinheiro");
		tipoPagamento.put("Cartão Debito", " em cartão de débito");
		tipoPagamento.put("Cartão de Crédito", " do limite do cartão de crédito");
		tipoPagamento.put("Cheque", " em cheque");
		tipoPagamento.put("Depósito", " em deposito bancario");

		do {
			System.out.println("Digite o valor ");
			valor = lerDouble(scan);
			System.out.println("Digite a forma de pagamento ");
			entrada = scan.nextLine();
			if (tipoPagamento.containsKey(entrada)) {
				System.out.println("Pago R$: " + valor + tipoPagamento.get(entrada));
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

}
