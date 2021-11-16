package Exercicios;

public class Animal {
	
	//ATRIBUTOS
	private String nome;
	private int idade;
	private boolean som;
	
	//METODOS
	void emitesom() {
		if(som == true) {
			System.out.println("Este animal emite som.");
		}
	}
	
	
	//GETSET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}
		

	
	
	
	
	
	
	
	
	
	
	

}
