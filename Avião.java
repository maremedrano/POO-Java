package Exercícios;

public class Avião {


	/*Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
	 */
	
	
	//ATRIBUTOS
	String companhiaaerea;
	String destino;
	int quantidadecadeiras;
	boolean lotado;
	boolean combustível;
	boolean manutencao;
	
	
	//METODOS
	
	void encerrarcompras() {
		if(lotado == true) {
			System.out.println("Todas as cadeiras foram reservadas.");
		}
		else {
			System.out.println("Há cadeiras vagas.");		
		}
	}

	void decolar() {
		if(combustível == true && manutencao == true) {
			System.out.println("O avião está pronto para decolar.");
		}
		else if(combustível == false) {
			System.out.println("O avião não pode decolar, pois está sem combustível.");
		}
		else if(manutencao == false) {
			System.out.println("O avião não pode decolar, pois precisa de manutenção.");
		}
	}
	
	
	
	// ESTADO

	void estado() {
		System.out.println("Companhia aérea: " + this.companhiaaerea);
		System.out.println("Destino: " + this.destino);
		System.out.println("Cadeiras: " + this.quantidadecadeiras);
		System.out.println("Avião lotado? " + this.lotado);
		System.out.println("Combustível ok? " + this.combustível);
		System.out.println("Manutenção ok? " + this.manutencao);
	}
	
	
	
}
