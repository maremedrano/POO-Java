package Exercícios;

public class ContaBancaria {

	/*
	Crie uma classe conta bancaria e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto conta bancaria, defina
	as instancias deste objeto e apresente as informações deste objeto no
	console.
	 */

	//ATRIBUTOS
	int agencia, conta;
	double saldo, fatura, saldoatual;
	
	//METODOS
	void pagarfatura() {
		if(saldo >= fatura) {
			System.out.println("A fatura foi paga com sucesso.");
			saldoatual = saldo - fatura;
		}
		else {
			System.out.println("Seu saldo não é suficiente para pagar a fatura.");
			saldoatual = saldo;
		}
	}
	
	//ESTADO
	void estado() {
		System.out.println("Número da agência: " + this.agencia);
		System.out.println("Número da conta: " + this.conta);
		System.out.println("Saldo anterior: " + this.saldo);
		System.out.println("Valor da fatura: " + this.fatura);
		System.out.println("Saldo atual: " + this.saldoatual);
	}


}
