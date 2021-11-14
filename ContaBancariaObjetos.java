package Exercícios;

public class ContaBancariaObjetos {

	public static void main(String[] args) {
		
	ContaBancaria conta1 = new ContaBancaria();
	conta1.agencia = 7079;
	conta1.conta = 1996;
	conta1.saldo = 1000.50;
	conta1.fatura = 937.45;
	conta1.pagarfatura();
	System.out.println("\n");
	conta1.estado();
	
	System.out.println("\n=====================================\n");
	
	ContaBancaria conta2 = new ContaBancaria();
	conta2.agencia = 7819;
	conta2.conta = 5462;
	conta2.saldo = 0.50;
	conta2.fatura = 52.9;
	conta2.pagarfatura();
	System.out.println("\n");
	conta2.estado();

	}

}
