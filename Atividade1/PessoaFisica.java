package Atividade1;

public class PessoaFisica extends Cliente {
	
	private String cPF;
	
	public PessoaFisica(int codigo, String nome, String endereço, int telefone, String cPF){
		super(codigo, nome, endereço, telefone);
		this.cPF=cPF;
		
		
	}

	public String getCPF() {
		return cPF;
	}

	public void setCPF(String CPF) {
		cPF = CPF;
	}
	
	
	public void validarCPF() {
		if(getCPF().length()!=11) {
			System.out.println("\n--CPF INVALIDO!!!");		
		}
		else {
			System.out.println("\n--CPF VALIDO");
		}
	}

	public void dadosCliente() {
		System.out.print("\nCódigo do cliente: "+getCodigo());
		System.out.print("\nO nome do cliente: "+getNome());
		System.out.print("\nO endereço do cliente: "+getEndereço());
		System.out.print("\nO numero do telefone do cliente: "+getTelefone());
		System.out.print("\nO CPF do cliente é: "+cPF);
		
	}
}
