package modelo;

/**
 * Define características essesciais do cliente, seus atributos e métodos
 * @author Samuel Avila e Lucas Macedo
 * @version 1.0 (Out 2020)
 */

public class Ingresso {
	
	private String tipo;
	private double preco;
	private String poltrona;
	private int sala;
	private Filme filme;
	
	
	public Ingresso(String t, double p, String po, int s) {
		tipo = t;
		preco = p;
		poltrona = po;
		sala = s;
	}

	/**
	 * Forma string dos atributos da classe a serem exibidos
	 * @return string com atributos da classe e suas identificação
	 */

	public String toString(){
		return "Tipo de ingresso: " + tipo + ", no valor de: R$ " + preco + ". Assento " + poltrona + " na sala " + sala;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(String poltrona) {
		this.poltrona = poltrona;
	}

}
