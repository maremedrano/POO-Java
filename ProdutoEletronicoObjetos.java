package Exercícios;

public class ProdutoEletronicoObjetos {

	public static void main(String[] args) {
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
		produto1.categoria = "Smartphone";
		produto1.marca = "Samsung";
		produto1.funcionando = true;
		produto1.ligado = false;
		produto1.ligar();
		produto1.desligar();
		produto1.estado();
		
		System.out.println("\n====================================\n");
		
		ProdutoEletronico produto2 = new ProdutoEletronico();
		produto2.categoria = "Tablet";
		produto2.marca = "Motorola";
		produto2.funcionando = false;
		produto2.ligado = false;
		produto2.ligar();
		produto2.desligar();
		produto2.estado();

	}

}
