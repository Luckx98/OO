package classes;

import java.util.Date;

public abstract class Pessoa {
	
	//Esses são atributos da Classe Pessoa
	
	private String nome;
	private Date dataNasc;
	private int cpf;

	public Pessoa(String np, Date dn, int c) {
		// np equivale ao nome pessoal, dn data de nascimento e o c cpf mesmo
		// Criamos dessa forma para que no main não haja conflito de variável
		nome = np;
		dataNasc = dn;
		cpf = c;
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
				;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
