package primeiroLote.exer07;

import java.util.ArrayList;

public class Aeroporto {

	private String nome;
	private int capacidadeVoo;
	private ArrayList<Aeroporto> destinos;
	private int numeroFuncionario;
	private String tipo;

	public Aeroporto(String nome, int capacidadeVoo, int numeroFuncionario, String tipo) {
		this.nome = nome;
		this.capacidadeVoo = capacidadeVoo;
		this.numeroFuncionario = numeroFuncionario;
		this.tipo = tipo;
		this.destinos = new ArrayList<>();
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public int getCapacidadeVoo() {
		return capacidadeVoo;
	}

	public void setCapacidadeVoo(int capacidadeVoo) {
		this.capacidadeVoo = capacidadeVoo;
	}

	public ArrayList<Aeroporto> getDestinos() {
		return destinos;
	}

	public void setDestinos(ArrayList<Aeroporto> destinos) {
		this.destinos = destinos;
	}

	public void setDestinos(Aeroporto destino) {
		this.destinos.add(destino);
	}

	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void autorizarPouso() {

	}

}
