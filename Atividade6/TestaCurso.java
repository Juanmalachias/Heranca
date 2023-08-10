package Atividade6;

import java.util.Random;

public class TestaCurso {
    public static void main(String[] args) {
        Random random = new Random();

        CursoLivre cursoLivre1 = new CursoLivre(random.nextInt(1000),"Curso de Marketing Digital",20.0,"Empresa X");

        CursoLivre cursoLivre2 = new CursoLivre(random.nextInt(1000),"Curso de Programação Java",40.0,"Empresa Y");

        Especializacao especializacao1 = new Especializacao(random.nextInt(1000),"Especialização em Engenharia de Software",360.0,
        "Reconhecido pelo MEC");

        Especializacao especializacao2 = new Especializacao(random.nextInt(1000),"Especialização em Gestão de Negócios",300.0,
        "Reconhecido pelo MEC");

        cursoLivre1.visualizar();
        System.out.println();
        cursoLivre2.visualizar();
        System.out.println();
        especializacao1.visualizar();
        System.out.println();
        especializacao2.visualizar();
    }
}
