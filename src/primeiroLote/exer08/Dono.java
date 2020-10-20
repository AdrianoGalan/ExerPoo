package primeiroLote.exer08;

public class Dono {

	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	private Animal[] animais;
	private int conAni;

	public Dono(String nome, String cpf, String telefone, String endereco, Animal... animals) {

		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.animais = new Animal[50];
		this.conAni = 0;

		for (int i = conAni; i < animals.length || conAni > 49; i++) {
			this.animais[i] = animals[i];
			conAni++;

		}

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Animal[] getAnimais() {
		return animais;
	}

	public void setAnimais(Animal... animals) {

		for (int i = conAni; i < animals.length || conAni > 49; i++) {
			this.animais[i] = animals[i];
			conAni++;

		}
	}

	public void levarAnimalPet() {

	}

}
