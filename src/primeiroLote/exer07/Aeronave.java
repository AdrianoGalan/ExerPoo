package primeiroLote.exer07;


public class Aeronave {

	private String modelo;
	private int capacidade;
	private Piloto piloto;
	private Passageiro[] passageiros;
	private Aeroporto destino;

	public Aeronave(String modelo, int capacidade, Piloto piloto, Aeroporto destino, Passageiro... passageiros) {

		this.modelo = modelo;
		this.capacidade = capacidade;
		this.piloto = piloto;
		this.passageiros = passageiros;
		this.destino = destino;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Passageiro[] getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(Passageiro[] passageiros) {
		this.passageiros = passageiros;
	}

	public Aeroporto getDestino() {
		return destino;
	}

	public void setDestino(Aeroporto destino) {
		this.destino = destino;
	}

	public void voar() {

	}

}
