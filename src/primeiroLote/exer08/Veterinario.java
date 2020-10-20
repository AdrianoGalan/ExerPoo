package primeiroLote.exer08;

public class Veterinario {

	private String nome;
	private String cpf;
	private String crmv;
	private String telefone;
	private Animal[] animaisTratados;
	private int conAni;
	
	

	public Veterinario(String nome, String cpf, String crmv, String telefone, Animal...animals) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.crmv = crmv;
		this.telefone = telefone;
		this.animaisTratados = new Animal[50];
		this.conAni = 0;
		
		for (int i = conAni; i < animals.length || conAni > 49; i++) {
			this.animaisTratados[i] = animals[i];
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

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Animal[] getAnimaisTratados() {
		return animaisTratados;
	}

	public void setAnimaisTratados(Animal...animals) {
		
		for (int i = conAni; i < animals.length || conAni > 49; i++) {
			this.animaisTratados[i] = animals[i];
			conAni++;

		}
	}

	public void tratarAnimal() {

	}

}
