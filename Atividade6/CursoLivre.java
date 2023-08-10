package Atividade6;

public class CursoLivre extends Curso {
    private String patrocinador;

    public CursoLivre(int codigo, String nome, double cargaHoraria, String patrocinador) {
        super(codigo, nome, cargaHoraria);
        this.patrocinador = patrocinador;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public void visualizar() {
        System.out.println("Dados do curso livre:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Carga Horária: " + getCargaHoraria());
        System.out.println("Patrocinador: " + patrocinador);
    }
}