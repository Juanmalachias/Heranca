package Atividade6;

public class Especializacao extends Curso {
    private String certificadoMEC;

    public Especializacao(int codigo, String nome, double cargaHoraria, String certificadoMEC) {
        super(codigo, nome, cargaHoraria);
        this.certificadoMEC = certificadoMEC;
    }

    public String getCertificadoMEC() {
        return certificadoMEC;
    }

    public void setCertificadoMEC(String certificadoMEC) {
        this.certificadoMEC = certificadoMEC;
    }

    public void visualizar() {
        System.out.println("Dados do curso de especialização:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Carga Horária: " + getCargaHoraria());
        System.out.println("Certificado MEC: " + certificadoMEC);
    }
}

