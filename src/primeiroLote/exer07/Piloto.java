package primeiroLote.exer07;

public class Piloto {

	private String nome;
	private String cpf;
	private String breve;
	private int horaVoo;
	private int idade;

	public Piloto(String nome, String cpf, String breve, int horaVoo, int idade) {

		this.nome = nome;
		this.cpf = cpf;
		this.breve = breve;
		this.horaVoo = horaVoo;
		this.idade = idade;
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

	public String getBreve() {
		return breve;
	}

	public void setBreve(String breve) {
		this.breve = breve;
	}

	public int getHoraVoo() {
		return horaVoo;
	}

	public void setHoraVoo(int horaVoo) {
		this.horaVoo = horaVoo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void pilotar() {

	}

}
