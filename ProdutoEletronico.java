package Exercícios;

public class ProdutoEletronico {

	/*Crie uma classe produto eletrônico e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto produto eletrônico,
	defina as instancias deste objeto e apresente as informações deste objeto
	no console.
	*/
	
	//ATRIBUTOS
	String categoria, marca;
	boolean funcionando, ligado;
	
	
	//METODOS
	
	void ligar() {
		if(ligado == true && funcionando == true) {
			System.out.println("O produto está ligando.");
		}
		
	}
	
	void desligar() {
		if(ligado == false && funcionando == true) {
			System.out.println("O produto está desligando.");
		}
		else if(funcionando == false) {
			System.out.println("O produto está quebrado.");
		}
	}
	
	
	//ESTADO
	
	void estado() {
		
		System.out.println("O produto é um " + this.categoria);
		System.out.println("A marca do produto é " + this.marca);
		System.out.println("Funcionando? " + this.funcionando);
		System.out.println("Ligado? " + this.ligado);
		
	}
	
	
}
