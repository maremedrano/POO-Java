package Exerc�cios;

public class Funcionario {
	
	/*
	Crie uma classe funcion�rio e apresente os atributos e m�todos
	referentes esta classe, em seguida crie um objeto funcion�rio, defina as
	instancias deste objeto e apresente as informa��es deste objeto no
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
			System.out.println("O funcion�rio receber� aumento por tempo de empresa.");
		}
	}
	
	void serpromovido() {
		if(anosDeEmpresa >= 2 && bomdesempenho == true) {
			System.out.println("O funcion�rio ser� promovido.");
		}
		else if(bomdesempenho == false) {
			System.out.println("O funcion�rio n�o ser� promovido, pois n�o teve um bom desempenho.");
		}
		
	}
	
	
	//ESTADO
	void estado() {
		System.out.println("Funcion�rio: " + this.nome);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Anos de empresa: " + this.anosDeEmpresa);
		System.out.println("Teve um bom desempenho? " + this.bomdesempenho);
		
	}
	
}
