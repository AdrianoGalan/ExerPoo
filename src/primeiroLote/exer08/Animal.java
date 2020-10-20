package primeiroLote.exer08;

public class Animal {

	private String raca;
	private String nome;
	private String nascimento;
	private String sexo;
	private Doenca[] doencas;
	private int numDo;

	public Animal(String raca, String nome, String nascimento, String sexo, Doenca... doencas) {

		this.raca = raca;
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.doencas = new Doenca[50];
		this.numDo = 0;

		for (int i = numDo; i < doencas.length || numDo > 49; i++) {
			this.doencas[i] = doencas[i];
			numDo++;

		}
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Doenca[] getDoencas() {
		return doencas;
	}

	public void setDoencas(Doenca... doencas) {

		for (int i = numDo; i < doencas.length || numDo > 49; i++) {
			this.doencas[i] = doencas[i];
			numDo++;

		}
	}

	public void ficarDoente() {

	}

}
