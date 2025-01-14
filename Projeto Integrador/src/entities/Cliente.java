package entities;

import java.time.LocalDate;

import exceptions.CpfNotNull;
import exceptions.NameNotNull;
import factorys.FactoryException;

public class Cliente {
	
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private LocalDate dataNascimento;
	private LocalDate dataCadastro;
	private String cep;
	private char sexo;
	
	public Cliente() {}
	
	public Cliente(String cpf, String nome, String endereco, String telefone, LocalDate nascimento,
						LocalDate dataCadastro, String cep, String sexo) 
					throws CpfNotNull, NameNotNull{
		
		setCpf(cpf);
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		setDataNascimento(dataNascimento);
		setDataCadastro(dataCadastro);
		setCep(cep);
		setSexo(sexo);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) throws CpfNotNull{
		if(!cpf.isEmpty()) {
			this.cpf = cpf;
		} else {
			FactoryException.callCpfNotNull();
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws NameNotNull{
		if(!nome.isEmpty()) {
			this.nome = nome;
		} else {
			FactoryException.callNameNotNull();
		}
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
	
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo.charAt(0);
	}
	
	
	
}
