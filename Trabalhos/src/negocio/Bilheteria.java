package negocio;

public class Bilheteria {

    private Sessao[] sessao;

    private Cliente cliente;

    private Funcionario funcionario;

  
    public Bilheteria(Sessao[] s, Cliente c, Funcionario f){
        sessao = s;
        cliente = c;
        funcionario = f;
    }

    public void buscarFilmes() {
        System.out.println(sessao);
    }

    public Sessao[] getSessao() {
        return sessao;
    }
        
    public void setSessao(Sessao[] sessao) {
        this.sessao = sessao;
    }
        
    public Funcionario getFuncionario() {
        return funcionario;
    }
        
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
     }
        
    public Cliente getCliente() {
        return cliente;
    }
        
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}