package Atividade3;

public class Jogo extends Game{
	
	private String genero;
	
	 public Jogo(int codigo, String descricao, double preco, String genero) {
	        super(codigo, descricao, preco);
	        this.genero = genero;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public void visualizar() {
	        System.out.println("Dados do jogo:");
	        System.out.println("Código: " + getCod());
	        System.out.println("Descrição: " + getDescrição());
	        System.out.println("Preço: " + getPreço());
	        System.out.println("Gênero: " + genero);
	    }

}
