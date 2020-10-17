package primeiroLote.exer07;

public class Passageiro {

	private String nome;
	private String cpf;
	private int idade;
	private boolean bagagem;
	private Aeroporto destino;

	public Passageiro(String nome, String cpf, int idade, boolean bagagem, Aeroporto destino) {

		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.bagagem = bagagem;
		this.destino = destino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isBagagem() {
		return bagagem;
	}

	public void setBagagem(boolean bagagem) {
		this.bagagem = bagagem;
	}

	public Aeroporto getDestino() {
		return destino;
	}

	public void setDestino(Aeroporto destino) {
		this.destino = destino;
	}

	public void fazerCheckIn() {

	}

}
