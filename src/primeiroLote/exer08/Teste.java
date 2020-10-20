package primeiroLote.exer08;

public class Teste {

	public static void main(String[] args) {
		
		
		Doenca d1 = new Doenca("actinobacilose", "grave", false, "remedio", "3 semanas");
		Doenca d2 = new Doenca("Berne", "não grave", false, "cirurgico", "1 semanas");
		Doenca d3 = new Doenca("Erlichiose", "gravissima", false, "remedio", "3 semanas");
		Doenca d4 = new Doenca("otite", "grave", false, "remedio", "2 semanas");
		
		Animal a1 = new Animal("canina", "totó", "2012", "masculino", d2, d4);
		Animal a2 = new Animal("bovina", "zum", "2015", "masculino", d1);
		Animal a3 = new Animal("felina", "lindinha", "2002", "feminino", d3);
		Animal a4 = new Animal("canina", "leão", "2007", "masculino", d2, d4, d3);
		
		Dono dono1 = new Dono("joaquim", "32522124213", "845215256", "rua da cloria", a1);
		Dono dono2 = new Dono("mariana", "32522124213", "845215256", "rua da cloria", a2, a4);
		Dono dono3 = new Dono("maria", "32522124213", "845215256", "rua da cloria", a3);
		
		Veterinario v1 = new Veterinario("Adriana", "65326542132", "12512", "451263253", a2);
		Veterinario v2 = new Veterinario("rafaela", "65326542132", "12512", "451263253", a1);
		Veterinario v3 = new Veterinario("roberta", "65326542132", "12512", "451263253", a3, a4);
		
		System.out.println(a4.getDoencas()[2].getNome());
		
		

	}

}
