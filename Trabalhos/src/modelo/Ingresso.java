package modelo;

public class Ingresso {
	
	private String tipo;
	private double preco;
	private String poltrona;
	private int sala;
	private Filme filme;
	
	
	public Ingresso(Cliente c, String t, double p, String po, int s) {
		// Criamos dessa forma para que no main não haja conflito de variável
		tipo = t;
		preco = p;
		poltrona = po;
		sala = s;
		
	}

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
