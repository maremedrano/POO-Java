package Exercícios;

public class FuncionarioObjetos {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Roberto";
		funcionario1.cargo = "Gerente de pessoas jurídicas";
		funcionario1.anosDeEmpresa = 3;
		funcionario1.bomdesempenho = true;
		funcionario1.receberaumento();
		funcionario1.serpromovido();
		System.out.print("\n");
		funcionario1.estado();
		
		System.out.println("\n==========================================\n");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Sandro";
		funcionario2.cargo = "Gerente de pessoas físicas";
		funcionario2.anosDeEmpresa = 2;
		funcionario2.bomdesempenho = false;
		funcionario2.receberaumento();
		funcionario2.serpromovido();
		System.out.print("\n");
		funcionario2.estado();
		
	}

}
