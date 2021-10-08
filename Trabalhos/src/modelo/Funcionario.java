package modelo;

/**
 * Define características essesciais dos funcionários, seus atributos e métodos
 * @author Samuel Avila e Lucas Macedo
 * @version 1.0 (Out 2020)
 */

public class Funcionario extends Pessoa{
    private String turno;
    private int codigoId;

	public Funcionario(){
		super();
	}

    public Funcionario(String n, int cpf, int id, String t){
        this.nome = n;
		turno = t;
        codigoId = id;
		this.cpf = cpf;
    }

	/**
	 * Forma string para exibição dos atributos pricipais da classe e suas identificações para o leitor
	 * @return string com atributos da classe
	 */
	public String toString(){
		return "Nome d@ funcionário " + nome + ", código identificador: " + codigoId + ", turno:" + turno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getId() {
		return codigoId;
	}

	public void setID(int codigoId) {
		this.codigoId = codigoId;
	}
}
