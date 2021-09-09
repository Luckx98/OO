package classes;

public class Cliente {
	
	private Pessoa nomeCliente;
	private Pessoa dataNascCliente;
	private Pessoa cpfCliente;
	private String cidade;
	private String estado;
	private String email;

	public Cliente(Pessoa nc, Pessoa dnc, Pessoa cc, String ci, String es, String em) {
		// Criamos dessa forma para que no main não haja conflito de variável.
		nomeCliente = nc;
		dataNascCliente = dnc;
		cpfCliente = cc;
		cidade =  ci;
		estado = es;
		email = em;
	}

	public Pessoa getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(Pessoa nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Pessoa getDataNascCliente() {
		return dataNascCliente;
	}

	public void setDataNascCliente(Pessoa dataNascCliente) {
		this.dataNascCliente = dataNascCliente;
	}

	public Pessoa getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(Pessoa cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
