package entities;

public class Fornecedor {
	
	
	private String nome;
	private String cep;
	private String endereco;
	private String telefone;
	private String email;
	private String cnpj;
	
	
	public Fornecedor(String nome, String cep, String endereco, String telefone, String email, String cnpj) {
		setNome(nome);
		setCep(cep);
		setEndereco(endereco);
		setTelefone(telefone);
		setEmail(email);
		setCnpj(cnpj);
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCNPJ() {
		return cnpj;
	}
	public void setCnpj(String cNPJ) {
		this.cnpj = cNPJ;
	}
	
	
	
}
