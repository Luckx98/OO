package classes;

public class Sessao {
	
	private Filme filme;
	private int sala;
	private double horario;
	private Ingresso ingresso;

	public Sessao(Filme fi, int sa, double ho, Ingresso in) {
		filme = fi;
		sala = sa;
		horario = ho;
		ingresso = in;
		//Criando assim para que não tenha conflito com as variáveis na main.
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public double getHorario() {
		return horario;
	}

	public void setHorario(double horario) {
		this.horario = horario;
	}

	public Ingresso getIngresso() {
		return ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}
	
	

}
