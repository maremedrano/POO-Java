package Exercicios;

public class main {

	public static void main(String[] args) {
		
		//CACHORRO
		animalcorre cachorro = new animalcorre();
		cachorro.setNome("Lola");
		cachorro.setIdade(4);
		cachorro.setSom(true);
		cachorro.setCorre(true);
		System.out.println("CACHORRO");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade());
		cachorro.corre();
		cachorro.emitesom();

		System.out.println("\n");
		
		
		//CAVALO
		animalcorre cavalo = new animalcorre();
		cavalo.setNome("Juca");
		cavalo.setIdade(10);
		cavalo.setSom(true);
		cavalo.setCorre(true);		
		System.out.println("CAVALO");
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		cavalo.corre();
		cavalo.emitesom();

		System.out.println("\n");
		
		
		//PREGUI�A
		animalsobe pregui�a = new animalsobe();
		pregui�a.setNome("Joana");
		pregui�a.setIdade(5);
		pregui�a.setSom(true);
		pregui�a.setSobeArvore(true);
		System.out.println("PREGUI�A");
		System.out.println("Nome: " + pregui�a.getNome());
		System.out.println("Idade: " + pregui�a.getIdade());
		pregui�a.sobeEmArvores();
		pregui�a.emitesom();

		System.out.println("\n");
		

	}

}
