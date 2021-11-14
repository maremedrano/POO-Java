package Exercícios;

public class Patinete {
	
	/*
	Crie uma classe patinete e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto patinete, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
	 */

	//ATRIBUTOS
	String marca;
	int quantidadeDeRodas;
	boolean motorizado;
	
	//METODOS
	void correr() {
		if(motorizado == true) {
			System.out.println("Por ser motorizado, patinete pode atingir alta velocidade.");
		}
		else {
			System.out.println("O patinete não atinge alta velocidade por si só.");
		}
	}
	
	void pararEmPe() {
		if(quantidadeDeRodas >=4) {
			System.out.println("O patinete pode parar em pé, sem apoio.");
		}	
		else {
			System.out.println("O patinete não pode parar em pé sem apoio.");
		}
	}
	
	//ESTADO
	void estado() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Quantidade de rodas: " + this.quantidadeDeRodas);
		System.out.println("É motorizado? " + this.motorizado);
	}
	
}
