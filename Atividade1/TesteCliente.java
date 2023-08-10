package Atividade1;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica P1 = new PessoaFisica(1049,"Marcela Oliveirs", "Rua do povo,666", 978675432, "234654789-54");
		PessoaFisica P2 = new PessoaFisica(1049,"Pedro Souza", "Rua vincente santos,987", 980766780, "890876567-09");
		PessoaJuridica J1= new PessoaJuridica(102,"Dr. Fernando de abreu", "Av. Nações Unidas, 7774", 55120960, "12.345.678/0001-00");
		PessoaJuridica J2= new PessoaJuridica(102,"Dr. Isabela Silva", "Av. Faria Lima, 2755", 40028055, "98.765.432/0001-00");
		
		P1.dadosCliente();
		System.out.println();
		P2.dadosCliente();
		System.out.println();
		J1.dadosPessoasJuridicas();
		System.out.println();
		J2.dadosPessoasJuridicas();
		System.out.println();
		
	}

}
