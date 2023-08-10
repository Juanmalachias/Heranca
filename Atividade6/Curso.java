package Atividade6;

public class Curso {
	 private int codigo;
	    private String nome;
	    private double cargaHoraria;

	    public Curso(int codigo, String nome, double cargaHoraria) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.cargaHoraria = cargaHoraria;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getCargaHoraria() {
	        return cargaHoraria;
	    }

	    public void setCargaHoraria(double cargaHoraria) {
	        this.cargaHoraria = cargaHoraria;
	    }
	}