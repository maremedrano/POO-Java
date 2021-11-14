package Exerc�cios;

public class ProdutoEletronico {

	/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	referentes esta classe, em seguida crie um objeto produto eletr�nico,
	defina as instancias deste objeto e apresente as informa��es deste objeto
	no console.
	*/
	
	//ATRIBUTOS
	String categoria, marca;
	boolean funcionando, ligado;
	
	
	//METODOS
	
	void ligar() {
		if(ligado == true && funcionando == true) {
			System.out.println("O produto est� ligando.");
		}
		
	}
	
	void desligar() {
		if(ligado == false && funcionando == true) {
			System.out.println("O produto est� desligando.");
		}
		else if(funcionando == false) {
			System.out.println("O produto est� quebrado.");
		}
	}
	
	
	//ESTADO
	
	void estado() {
		
		System.out.println("O produto � um " + this.categoria);
		System.out.println("A marca do produto � " + this.marca);
		System.out.println("Funcionando? " + this.funcionando);
		System.out.println("Ligado? " + this.ligado);
		
	}
	
	
}
