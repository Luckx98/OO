package modelo;

import java.sql.Date;

public class Cliente extends Pessoa {
	private String cidade;
	private String estado;
	private String email;

	public Cliente(){
		super();
	}

	//Sobrecarga
	public Cliente(String n, java.util.Date d, String ci, String es, String em, int cpf ) {
		cidade =  ci;
		estado = es;
		email = em;
		this.nome = n;
		this.cpf = cpf;
		this.dataNasc = d;
	}

	public Cliente(String n, Date dN, String ci, String em, int cpf ) {
		cidade =  ci;
		email = em;
		this.nome = n;
		this.cpf = cpf;
		this.dataNasc = dN;
	}

	// public void inserirEditarCliente(Cliente cliente) {

	// }

	public String toString() {	
		return "Nome do cliente: " + nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

