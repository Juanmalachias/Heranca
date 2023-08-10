package Atividade4;

public class Medicamento extends Farmacia {
	private String principioAtivo;

    public Medicamento(int codigo, String nome, String endereco, String principioAtivo) {
        super(codigo, nome, endereco);
        this.principioAtivo = principioAtivo;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public void visualizar() {
        System.out.println("Dados do medicamento:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Princípio Ativo: " + principioAtivo);
    }

}
