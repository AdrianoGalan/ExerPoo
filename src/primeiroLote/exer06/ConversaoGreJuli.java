package primeiroLote.exer06;

public class ConversaoGreJuli {


	public int converter(int dia, int mes, int ano) {

		int inteiro;
		float a, b, c, d, e, dataJu, resto;

		a = ano / 100;
		b = a / 4;
		c = 2 - a + b;
		d = (float) (365.25 * (ano + 4716));
		e = (float) (30.6001 * mes + 1);
		dataJu = (float) ((d + e + dia + 0.5 + c - 1524.5) + 30);

		inteiro = (int) dataJu;
		resto = dataJu - inteiro;

		if (resto == 0) {
			inteiro--;
			return inteiro;
		} else {

			return inteiro;
		}

	}

}
