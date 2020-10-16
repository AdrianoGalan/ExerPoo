package primeiroLote.exer02;

import java.util.Date;

public class Conta {

	private double saldo;
	private String numero;
	private String senha;
	private Transacao[] historico;
	
	
	public boolean efetuarSaque(double Valor) {
		
		return false;
	}
	
	
	public boolean efetuarDeposito(double Valor) {
		
		return false;
	}
	
	public boolean efetuarPagamento(String boleto, double Valor) {
		
		return false;
	}

	public Transacao[] extrato(Date inicio, Date fim) {
		
		return this.historico;
	}
	
	

}
