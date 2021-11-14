package Exercícios;

public class AviãoObjetos {

	public static void main(String[] args) {

		Avião aviao1 = new Avião();
		aviao1.companhiaaerea = "TAM";
		aviao1.destino = "São Paulo";
		aviao1.quantidadecadeiras = 60;
		aviao1.lotado = true;
		aviao1.combustível = false;
		aviao1.manutencao = true;
		aviao1.encerrarcompras();
		aviao1.decolar();
		System.out.print("\n");
		aviao1.estado();
		
		System.out.println("\n======================================\n");
		
		Avião aviao2 = new Avião();
		aviao2.companhiaaerea = "Azul";
		aviao2.destino = "Recife";
		aviao2.quantidadecadeiras = 50;
		aviao2.lotado = false;
		aviao2.combustível = true;
		aviao2.manutencao = true;
		aviao2.encerrarcompras();
		aviao2.decolar();
		System.out.print("\n");
		aviao2.estado();
				
		
	}

}
