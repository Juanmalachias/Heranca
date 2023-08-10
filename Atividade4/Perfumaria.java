package Atividade4;

public class Perfumaria extends Farmacia {
    private String fragrancia;

    public Perfumaria(int codigo, String nome, String endereco, String fragrancia) {
        super(codigo, nome, endereco);
        this.fragrancia = fragrancia;
    }

    public String getFragrancia() {
        return fragrancia;
    }

    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    public void visualizar() {
        System.out.println("Dados do produto de perfumaria:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Fragrância: " + fragrancia);
    }
}