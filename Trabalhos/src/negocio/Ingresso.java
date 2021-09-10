package negocio;

public class Ingresso {

	private String tipo;
	private double preco;
	private String poltrona;
	private int sessao;
	
	public Ingresso(String t, double p, String po, int s) {
		// Criamos dessa forma para que no main não haja conflito de variável
		tipo = t;
		preco = p;
		poltrona = po;
		sessao = s;
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

	public int getSessao() {
		return sessao;
	}

	public void setSessao(int sessao) {
		this.sessao = sessao;
	}

}
