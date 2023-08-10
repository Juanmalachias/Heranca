package Atividade1;

public class Cliente {

	private int codigo;
	private String nome;
	private String endereço;
	private int telefone;
	
	
	
	public Cliente(int codigo, String nome, String endereço, int telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereço() {
		return endereço;
	}



	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
