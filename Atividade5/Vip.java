package Atividade5;

public class Vip extends Ingresso {
    private String beneficios;

    public Vip(int codigo, double preco, String beneficios) {
        super(codigo, preco);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public void visualizar() {
        System.out.println("Dados do ingresso VIP:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Preço: " + getPreco());
        System.out.println("Benefícios: " + beneficios);
    }
}