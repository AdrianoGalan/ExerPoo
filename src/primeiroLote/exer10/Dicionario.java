package primeiroLote.exer10;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> dicionario;
	private String palavra;
	private String definicao;

	public Dicionario() {

		this.dicionario = new HashMap<String, String>();

	}
	
	public boolean consulta(String palavra) {
		
		if(dicionario.containsKey(palavra)) {
			 System.out.println(this.dicionario.get(palavra));
			 return true;
			 
		}else {
			return false;
		}
		
		
	}
	
	public void adicionar(String palavra, String definicao) {
		
	 dicionario.put(palavra, definicao);
	 System.out.println("Palavra Adicionada");
		
		
	}
	

}
