package Exercícios;

public class PacienteObjetos {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		paciente1.nome = "Rosane";
		paciente1.oxigenação = 95;
		paciente1.febre = false;
		paciente1.paladar = false;
		paciente1.olfato = true;
		paciente1.examesok = true;
		paciente1.serinternado();
		paciente1.receberalta();
		System.out.print("\n");
		paciente1.estado();
		
		System.out.println("\n=============================================\n");

		Paciente paciente2 = new Paciente();
		paciente2.nome = "Jonas";
		paciente2.oxigenação = 89;
		paciente2.febre = false;
		paciente2.paladar = false;
		paciente2.olfato = true;
		paciente2.examesok = true;
		paciente2.serinternado();
		paciente2.receberalta();
		System.out.print("\n");
		paciente2.estado();
	}

}
