package primeiroLote.exer08;

public class Doenca {

	private String nome;
	private String gravidade;
	private boolean internação;
	private String tratamento;
	private String tempoRecuperacao;

	public Doenca() {

	}

	public Doenca(String nome, String gravidade, boolean internação, String tratamento, String tempoRecuperacao) {

		this.nome = nome;
		this.gravidade = gravidade;
		this.internação = internação;
		this.tratamento = tratamento;
		this.tempoRecuperacao = tempoRecuperacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGravidade() {
		return gravidade;
	}

	public void setGravidade(String gravidade) {
		this.gravidade = gravidade;
	}

	public boolean isInternação() {
		return internação;
	}

	public void setInternação(boolean internação) {
		this.internação = internação;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public String getTempoRecuperacao() {
		return tempoRecuperacao;
	}

	public void setTempoRecuperacao(String tempoRecuperacao) {
		this.tempoRecuperacao = tempoRecuperacao;
	}

	public void tirarEnergia() {

	}

}
