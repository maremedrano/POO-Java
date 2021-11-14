package Exerc�cios;

public class Avi�o {


	/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.
	 */
	
	
	//ATRIBUTOS
	String companhiaaerea;
	String destino;
	int quantidadecadeiras;
	boolean lotado;
	boolean combust�vel;
	boolean manutencao;
	
	
	//METODOS
	
	void encerrarcompras() {
		if(lotado == true) {
			System.out.println("Todas as cadeiras foram reservadas.");
		}
		else {
			System.out.println("H� cadeiras vagas.");		
		}
	}

	void decolar() {
		if(combust�vel == true && manutencao == true) {
			System.out.println("O avi�o est� pronto para decolar.");
		}
		else if(combust�vel == false) {
			System.out.println("O avi�o n�o pode decolar, pois est� sem combust�vel.");
		}
		else if(manutencao == false) {
			System.out.println("O avi�o n�o pode decolar, pois precisa de manuten��o.");
		}
	}
	
	
	
	// ESTADO

	void estado() {
		System.out.println("Companhia a�rea: " + this.companhiaaerea);
		System.out.println("Destino: " + this.destino);
		System.out.println("Cadeiras: " + this.quantidadecadeiras);
		System.out.println("Avi�o lotado? " + this.lotado);
		System.out.println("Combust�vel ok? " + this.combust�vel);
		System.out.println("Manuten��o ok? " + this.manutencao);
	}
	
	
	
}
