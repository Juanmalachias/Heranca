package Atividade5;

public class MeiaEntrada extends Ingresso {
    private String tipo;

    public MeiaEntrada(int codigo, double preco, String tipo) {
        super(codigo, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void visualizar() {
        System.out.println("Dados do ingresso de meia entrada:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Preço: " + getPreco());
        System.out.println("Tipo: " + tipo);
    }
}