package Exercicios;

public class animalsobe extends Animal{
	
	//ATRIBUTOS
	boolean sobeArvore;
	
	void sobeEmArvores() {
		if(sobeArvore == true) {
			System.out.println("Este animal sobe em árvores.");
		}
		
	}

	public boolean isSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}

}
