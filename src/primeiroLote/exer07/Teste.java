package primeiroLote.exer07;

public class Teste {

	public static void main(String[] args) {

		Aeroporto aeroportoSp = new Aeroporto("SP", 1000, 2500, "internacional");
		Aeroporto aeroportoRj = new Aeroporto("RJ", 500, 1500, "internacional");
		Aeroporto aeroportoAm = new Aeroporto("AM", 100, 250, "nacional");

		aeroportoSp.setDestinos(aeroportoRj);
		aeroportoSp.setDestinos(aeroportoAm);
		aeroportoRj.setDestinos(aeroportoSp);
		aeroportoRj.setDestinos(aeroportoAm);
		aeroportoAm.setDestinos(aeroportoSp);

		Passageiro p1 = new Passageiro("p1", "123456789", 32, false, aeroportoSp);
		Passageiro p2 = new Passageiro("p2", "987654321", 7, false, aeroportoSp);
		Passageiro p3 = new Passageiro("p3", "569874123", 85, true, aeroportoRj);
		Passageiro p4 = new Passageiro("p4", "321654987", 16, true, aeroportoAm);

		Piloto piloto1 = new Piloto("piloto1", "123456987", "1234", 320, 30);
		Piloto piloto2 = new Piloto("piloto2", "789456123", "4567", 420, 40);
		Piloto piloto3 = new Piloto("piloto3", "321654987", "8912", 120, 20);

		Aeronave a1 = new Aeronave("A320", 320, piloto1, aeroportoSp, p3, p2);
		Aeronave a2 = new Aeronave("A120", 120, piloto3, aeroportoAm, p4);
		Aeronave a3 = new Aeronave("777max", 200, piloto2, aeroportoRj, p1);

	}

}
