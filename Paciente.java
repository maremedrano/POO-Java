package Exerc�cios;

public class Paciente {

	/*
	Crie uma classe paciente e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto paciente, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.
	 */
	
	//ATRIBUTOS
	String nome;
	boolean febre, paladar, olfato, dor, examesok;
	double oxigena��o;
	
	
	//METODOS
	void receberalta() {
		if(oxigena��o >= 90 && examesok == true && febre == false) {
			System.out.println("O paciente receber� alta.");
		}
	}
	
	void serinternado() {
		if(oxigena��o < 90) {
			System.out.println("O paciente deve ser internado, pois est� com satura��o de oxig�nio baixa.");
		}
		if(febre == true) {
			System.out.println("O paciente deve ser internado, pois est� com febre.");
		}
		else if(oxigena��o >= 90 && febre == false) {
			if(paladar == true || olfato == true || dor == true) {
				if(examesok == true) {
				System.out.println("O paciente est� com sintomas leves. \nOs resultados de seus exames n�o indicaram necessidade de interna��o.");
				}
				else {
				System.out.println("O paciente est� com sintomas leves. \nEntretanto, os resultados de seus exames indicaram necessidade de interna��o.");
				}
			}
		}
	}
	
	//ESTADO
	void estado() {
		System.out.println("Paciente: " + this.nome);
		System.out.println("Satura��o de oxig�nio: " + this.oxigena��o);
		System.out.println("Febre? " + this.febre);
		System.out.println("Paladar afetado? " + this.paladar);
		System.out.println("Olfato afetado? " + this.olfato);
		System.out.println("Est� com dor? " + this.dor);
	}
	
	
}
