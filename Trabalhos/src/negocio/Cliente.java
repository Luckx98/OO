package negocio;

import java.util.*;

public class Cliente extends Pessoa {
	private String cidade;
	private String estado;
	private String email;

	public Cliente(String n, Date d, int c, String ci, String es, String em) {
		// Criamos dessa forma para que no main não haja conflito de variável
		nome = n;
		dataNasc = d;
		cpf = c;
		cidade =  ci;
		estado = es;
		email = em;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNasc;
	}

	public void setDataNascimento(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getCPF() {
		return cpf;
	}

	public void setCPF(int cpf) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
