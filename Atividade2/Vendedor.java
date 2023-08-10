package Atividade2;

public class Vendedor extends Funcionarios{
	
	private double porcentagemAumento;
	
	public Vendedor(String cargo, String nome, int codSetor, int aumentoSalarial, double porcentagemAumento) {
		super(cargo, nome,codSetor,aumentoSalarial);
		this.porcentagemAumento=porcentagemAumento;
	}

	public double getPorcentagemAumento() {
		return porcentagemAumento;
	}

	public void setPorcentagemAumento(double porcentagemAumento) {
		this.porcentagemAumento = porcentagemAumento;
	}
	public void novoSalario() {
		double novoSalario = aumentoSalarial + ((aumentoSalarial*porcentagemAumento)/100);
		System.out.print("\nPara o cargo: "+getCargo());
		System.out.print("\nDo funcionario do nome: "+getNome());
		System.out.print("\nResponsavel pelo setor: "+getCodSetor());
		System.out.print("\nSeu antigo salario era: "+getAumentoSalarial());
		System.out.print("\nSeu salario atual é: "+novoSalario);
	
	}

}
