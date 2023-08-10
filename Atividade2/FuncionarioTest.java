package Atividade2;

public class FuncionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente("Gerente de vendas","Maria Souza",456,4321,12);
		Vendedor v1 = new Vendedor("Vendedor de eletronico", "Luis souza", 12, 1500,7);

		g1.novoSalario();
		System.out.println();
		v1.novoSalario();
		System.out.println();
	}

}
