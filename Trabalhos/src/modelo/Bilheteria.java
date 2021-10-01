package modelo;

public class Bilheteria {
	
	private Filme[] filmes = new Filme[10];
	private int numFilmes = 0;
	private Cliente cliente;
	private int horariosDisponiveis = 3;
	private Ingresso ingresso;
	private double[] cronograma = new double [horariosDisponiveis];

	public Bilheteria(Ingresso i, Cliente c) {
		ingresso = i;
		cliente = c;
		//Criando assim  para que não tenha conflito com as variáveis na main.
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Ingresso getIngresso() {
		return ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}

	public double getHorario(int i){
		return cronograma[i];
	}

	public void setArrayCronograma(double horario, int i) {
		this.cronograma[i] = horario;
	}

	public String consultarFilmes(){
		String saida = "***** Lista de Filmes ***** \n";
		for(int i = 0; i < numFilmes; i++){
			saida = saida +  "\n" + filmes[i].getNome();
		} 
		return saida;
	}

	public String consultarCronograma(int j){
		String saida = "Horarios para o filme " + filmes[j].getNome() + ": ";
		for(int i = 0; i<horariosDisponiveis; i++){
			saida = saida + "\n" + getHorario(i);
		}
		return saida;
	}

}
