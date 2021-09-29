package modelo;

public class Funcionario {
    
    private Pessoa nomeFunc;
    private Pessoa dataNascFunc;
    private Pessoa cpfFunc;
    private String horario;
    private int codigoId;

    public Funcionario(Pessoa nf, Pessoa df, Pessoa cf, String h, int cd){
        nomeFunc = nf;
        dataNascFunc = df;
        cpfFunc = cf;
        horario = h;
        codigoId = cd;
    }

    public Pessoa getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(Pessoa nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public Pessoa getDataNascFunc() {
		return dataNascFunc;
	}

	public void setDataNascFunc(Pessoa dataNascFunc) {
		this.dataNascFunc = dataNascFunc;
	}

	public Pessoa getCpfFunc() {
		return cpfFunc;
	}

	public void setCpfFunc(Pessoa cpfFunc) {
		this.cpfFunc = cpfFunc;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

    public int setCodigoId() {
        return codigoId;
    }

    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }


}
