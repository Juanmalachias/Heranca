package Atividade3;

public class Produto {

	private int cod;
	private String descrição;
	private double preço;
	
	
	public Produto(int cod, String descrição, double preço) {
		super();
		this.cod = cod;
		this.descrição = descrição;
		this.preço = preço;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public String getDescrição() {
		return descrição;
	}


	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}


	public double getPreço() {
		return preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	
}
