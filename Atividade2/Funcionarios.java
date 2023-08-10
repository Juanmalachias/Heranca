package Atividade2;

public class Funcionarios {

	private String cargo;
	private String nome;
	private int codSetor;
	protected int aumentoSalarial;
	
	
	public Funcionarios(String cargo, String nome, int codSetor, int aumentoSalarial) {
		super();
		this.cargo = cargo;
		this.nome = nome;
		this.codSetor = codSetor;
		this.aumentoSalarial = aumentoSalarial;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodSetor() {
		return codSetor;
	}


	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}


	public int getAumentoSalarial() {
		return aumentoSalarial;
	}


	public void setAumentoSalarial(int aumentoSalarial) {
		this.aumentoSalarial = aumentoSalarial;
	}
	
	
	
}
