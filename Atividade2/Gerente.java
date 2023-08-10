package Atividade2;

public class Gerente extends Funcionarios{
	
	private double valoraumento;
	
	public Gerente(String cargo, String nome, int codSetor, int aumentoSalarial, double valoraumento) {
	
	super(cargo, nome,codSetor,aumentoSalarial);
	this.valoraumento=valoraumento;
	}

	public double getValoraumento() {
		return valoraumento;
	}

	public void setValoraumento(double valoraumento) {
		this.valoraumento = valoraumento;
	}
	
	public void novoSalario() {
		double novoSalario = aumentoSalarial + ((valoraumento*aumentoSalarial)/100);
		System.out.print("\nPara o cargo: "+getCargo());
		System.out.print("\nDo funcionario do nome: "+getNome());
		System.out.print("\nResponsavel pelo setor: "+getCodSetor());
		System.out.print("\nSeu antigo salario era: "+getAumentoSalarial());
		System.out.print("\nSeu salario atual é: "+(double)novoSalario);
	}

}
