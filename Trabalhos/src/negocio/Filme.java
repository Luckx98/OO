package negocio;

import java.util.*;

public class Filme {
	
	private String nome;
	private Date estreia;
	private double duracao;
	private String genero;
	private String sinopse;
	private String idiomas;
	
	public Filme(String nf, Date es, double du, String ge, String si, String id) {
		nome = nf;
		estreia =  es;
		duracao = du;
		genero = ge;
		sinopse = si;
		idiomas = id;
		// nf equivale ao nome do filme, es a estreia, du a duracao do filme
		// ge euqivale ao genero do filme, si a sinopse e id ao idioma
		// Criamos dessa forma para que no main não haja conflito de variável
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getEstreia() {
		return estreia;
	}


	public void setEstreia(Date estreia) {
		this.estreia = estreia;
	}


	public double getDuracao() {
		return duracao;
	}


	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getSinopse() {
		return sinopse;
	}


	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}


	public String getIdiomas() {
		return idiomas;
	}


	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}


}
