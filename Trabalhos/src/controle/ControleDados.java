package controle;

import modelo.*;

public class ControleDados {
    private Dados d = new Dados();

    public ControleDados() {
        d.fillWithSomeData();
    }

    public Dados getDados() {
        return d;
    }

    public void setDados(Dados d) {
        this.d = d;
    }

    public Cliente[] getClientes() {
        return this.d.getClientes();
    }

    public int getQntClientes() {
        return this.d.getQntClientes();
    }

    public Funcionario[] getFuncionarios() {
        return this.d.getFuncionarios();
    }

    public int getQntFuncionarios() {
        return this.d.getQntFuncionarios();
    }

}
