package primeiroLote.exer12;

public class teste {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setFaltasNoAno(1);
		f1.setNome("joão");
		f1.setSalario(1000);

		Funcionario f3 = new Funcionario();
		f3.setFaltasNoAno(4);
		f3.setNome("maria");
		f3.setSalario(1000);
		
		Funcionario f2 = new Funcionario();
		f2.setFaltasNoAno(3);
		f2.setNome("manuel");
		f2.setSalario(1000);
		
		Rh rh = new Rh();
		
		rh.adicionarFuncionario(f1);
		rh.adicionarFuncionario(f2);
		rh.adicionarFuncionario(f3);
		
		rh.mostraBonusTodosFuncionarios();
		
		rh.removerFuncionario(f2);
		
		rh.mostraBonusTodosFuncionarios();
		

	}

}
