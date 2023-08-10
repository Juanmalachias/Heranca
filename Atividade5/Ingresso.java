package Atividade5;

public class Ingresso {

private int codigo;
private double preco;

public Ingresso(int codigo, double preco) {
    this.codigo = codigo;
    this.preco = preco;
}

public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    this.preco = preco;
}

}
