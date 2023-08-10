package Atividade1;

public class PessoaJuridica extends Cliente{

	private String cnpj;
	
	public PessoaJuridica(int codigo, String nome, String endereço, int telefone, String cnpj){
		super(codigo, nome, endereço, telefone);
		this.cnpj=cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void validarCNPJ() {
		if(getCnpj().length()!=16) {
			System.out.println("\nCNPJ Invalido!!");
		}else {
			System.out.println("\nCNPJ Valido");
		}
	}
	
	public void dadosPessoasJuridicas() {
		System.out.print("\nCódigo da pessoal Juridica: "+getCodigo());
		System.out.print("\nNome da pessoa juridica ou do Representante: "+getNome());
		System.out.print("\nEndereçõ da empresa ou da matriz: "+getEndereço());
		System.out.print("\nTefone do juridico: "+getTelefone());
		System.out.print("\nCNPJ da empresa: "+cnpj);
	}
	
}
