package Atividade3;

public class Console extends Game {

	private String Fabricante;
	 public Console(int codigo, String descricao, double preco, String fabricante) {
	        super(codigo, descricao, preco);
	        this.Fabricante = fabricante;
	    }

	    public String getFabricante() {
	        return Fabricante;
	    }

	    public void setFabricante(String fabricante) {
	        this.Fabricante = fabricante;
	    }

	    public void visualizar() {
	        System.out.println("Dados do console:");
	        System.out.println("Código: " + getCod());
	        System.out.println("Descrição: " + getDescrição());
	        System.out.println("Preço: " + getPreço());
	        System.out.println("Fabricante: " + getFabricante());
	    }
	
}
