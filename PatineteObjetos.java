package Exercícios;

public class PatineteObjetos {

	public static void main(String[] args) {

	Patinete patinete1 = new Patinete();
	patinete1.marca = "Atrio";
	patinete1.quantidadeDeRodas = 4;
	patinete1.motorizado = true;
	patinete1.estado();
	patinete1.pararEmPe();
	patinete1.correr();
	
	System.out.println("\n===================================\n");
	
	Patinete patinete2 = new Patinete();
	patinete1.marca = "Oxelo";
	patinete1.quantidadeDeRodas = 3;
	patinete1.motorizado = false;
	patinete1.estado();
	patinete1.pararEmPe();
	patinete1.correr();
		
	}

}
