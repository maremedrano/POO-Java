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
		
		
		//PREGUIÇA
		animalsobe preguiça = new animalsobe();
		preguiça.setNome("Joana");
		preguiça.setIdade(5);
		preguiça.setSom(true);
		preguiça.setSobeArvore(true);
		System.out.println("PREGUIÇA");
		System.out.println("Nome: " + preguiça.getNome());
		System.out.println("Idade: " + preguiça.getIdade());
		preguiça.sobeEmArvores();
		preguiça.emitesom();

		System.out.println("\n");
		

	}

}
