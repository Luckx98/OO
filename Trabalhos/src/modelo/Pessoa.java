package modelo;

/**
 * Define características essesciais de toda pessoa envolvida no software, seus atributos e métodos
 * @author Samuel Avila e Lucas Macedo
 * @version 1.0 (Out 2020)
 */

import java.util.Date;

public abstract class Pessoa {
	protected String nome;
	protected Date dataNasc;
	protected int cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getCPF() {
		return cpf;
	}

	public void setCPF(int cpf) {
		this.cpf = cpf;
	}

}
