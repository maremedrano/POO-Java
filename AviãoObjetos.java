package Exerc�cios;

public class Avi�oObjetos {

	public static void main(String[] args) {

		Avi�o aviao1 = new Avi�o();
		aviao1.companhiaaerea = "TAM";
		aviao1.destino = "S�o Paulo";
		aviao1.quantidadecadeiras = 60;
		aviao1.lotado = true;
		aviao1.combust�vel = false;
		aviao1.manutencao = true;
		aviao1.encerrarcompras();
		aviao1.decolar();
		System.out.print("\n");
		aviao1.estado();
		
		System.out.println("\n======================================\n");
		
		Avi�o aviao2 = new Avi�o();
		aviao2.companhiaaerea = "Azul";
		aviao2.destino = "Recife";
		aviao2.quantidadecadeiras = 50;
		aviao2.lotado = false;
		aviao2.combust�vel = true;
		aviao2.manutencao = true;
		aviao2.encerrarcompras();
		aviao2.decolar();
		System.out.print("\n");
		aviao2.estado();
				
		
	}

}
