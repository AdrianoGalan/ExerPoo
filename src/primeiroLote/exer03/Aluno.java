package primeiroLote.exer03;

import java.util.Date;

public class Aluno {

	private long id;
	private String nome;
	private String ra;
	private Date nascimento;

	public Aluno() {

	}

	public Aluno(long id, String nome, String ra, Date nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.ra = ra;
		this.nascimento = nascimento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public void exibir() {
		System.out.println("Aluno [id=" + id + ", nome=" + nome + ", ra=" + ra + ", nascimento=" + nascimento + "]");
	}

}
