package modelo;

import java.util.*;

public class Funcionario extends Pessoa  {
    
    private String horario;
    private int codigoId;

    public Funcionario(String n, Date d, int c, String h, int id){
        nome = n;
		dataNasc = d;
		cpf = c;
		horario = h;
        codigoId = id;
    }

	public String toString(){
		return "Nome d@ funcionário " + nome + ", código identificador: " + codigoId;
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

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

    public int getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }


}
