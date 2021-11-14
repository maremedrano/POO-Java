package Exercícios;

public class Funcionario {
	
	/*
	Crie uma classe funcionário e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto funcionário, defina as
	instancias deste objeto e apresente as informações deste objeto no
	console.
	*/
	
	//ATRIBUTOS
	String nome;
	String cargo;
	int anosDeEmpresa;
	boolean bomdesempenho;
	
	
	//METODOS
	void receberaumento() {
		if(anosDeEmpresa >= 2) {
			System.out.println("O funcionário receberá aumento por tempo de empresa.");
		}
	}
	
	void serpromovido() {
		if(anosDeEmpresa >= 2 && bomdesempenho == true) {
			System.out.println("O funcionário será promovido.");
		}
		else if(bomdesempenho == false) {
			System.out.println("O funcionário não será promovido, pois não teve um bom desempenho.");
		}
		
	}
	
	
	//ESTADO
	void estado() {
		System.out.println("Funcionário: " + this.nome);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Anos de empresa: " + this.anosDeEmpresa);
		System.out.println("Teve um bom desempenho? " + this.bomdesempenho);
		
	}
	
}
