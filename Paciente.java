package Exercícios;

public class Paciente {

	/*
	Crie uma classe paciente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto paciente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
	 */
	
	//ATRIBUTOS
	String nome;
	boolean febre, paladar, olfato, dor, examesok;
	double oxigenação;
	
	
	//METODOS
	void receberalta() {
		if(oxigenação >= 90 && examesok == true && febre == false) {
			System.out.println("O paciente receberá alta.");
		}
	}
	
	void serinternado() {
		if(oxigenação < 90) {
			System.out.println("O paciente deve ser internado, pois está com saturação de oxigênio baixa.");
		}
		if(febre == true) {
			System.out.println("O paciente deve ser internado, pois está com febre.");
		}
		else if(oxigenação >= 90 && febre == false) {
			if(paladar == true || olfato == true || dor == true) {
				if(examesok == true) {
				System.out.println("O paciente está com sintomas leves. \nOs resultados de seus exames não indicaram necessidade de internação.");
				}
				else {
				System.out.println("O paciente está com sintomas leves. \nEntretanto, os resultados de seus exames indicaram necessidade de internação.");
				}
			}
		}
	}
	
	//ESTADO
	void estado() {
		System.out.println("Paciente: " + this.nome);
		System.out.println("Saturação de oxigênio: " + this.oxigenação);
		System.out.println("Febre? " + this.febre);
		System.out.println("Paladar afetado? " + this.paladar);
		System.out.println("Olfato afetado? " + this.olfato);
		System.out.println("Está com dor? " + this.dor);
	}
	
	
}
