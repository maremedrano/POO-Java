package Exerc�cios;

public class ClienteObjetos {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Mariana";
		cliente1.endere�o = "Av. Ipiranga";
		cliente1.idade = 25;
		cliente1.cpf = "38938938938";
		cliente1.naomostrarcartao();
		cliente1.comprar();
		cliente1.estado();
		
		System.out.println("\n=======================================\n");
		
		cliente1.nome = "Silvana";
		cliente1.endere�o = "Av. S�o Jo�o";
		cliente1.idade = 52;
		cliente1.cpf = "12312312312";
		cliente1.mostrarcartao();
		cliente1.comprar();
		cliente1.estado();

	}

}
