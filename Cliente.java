package Exerc�cios;

public class Cliente {
	
	/*Crie uma classe cliente e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.
	*/

	//ATRIBUTOS
	String nome;
	String endere�o;
	String cpf;
	int idade;
	boolean cartao, comprou;
	
	
	//METODOS
	
	void mostrarcartao() {
		this.cartao = true;
	}
	
	void naomostrarcartao() {
		this.cartao = false;
	}

	void comprar() {
		if(this.cartao == true) {
			this.comprou = true;
			System.out.println("Compra realizada com sucesso.");
		}
		else if(this.cartao == false) {
			this.comprou = false;
			System.out.println("Compra negada. Apresente o cart�o para comprar.");
		}
	}
	
		
	//ESTADO
	
	void estado() {
		
		System.out.println("\nCADASTRO:");
		System.out.println("Nome: " + this.nome);
		System.out.println("Endere�o: " + this.endere�o);
		System.out.println("Idade: " + this.idade);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Possui cart�o? " + this.cartao);
		System.out.println("Comprou? " + this.comprou);
	
		if(this.nome != null && this.endere�o != null && this.cpf != null
				&& this.cartao == true) {
					System.out.println("A compra foi realizada com cadastro.");
				}
				
				else if(this.nome == null || this.endere�o == null || this.cpf != null
				&& this.cartao == true) {
					System.out.println("A compra foi realizada sem cadastro.");
				}
		
	}
}