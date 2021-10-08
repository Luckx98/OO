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

    // // a posicao 0 do vetor dadosClientes indica onde os dados devem ser
    // inseridos
    // public boolean inserirEditarCliente(String[] dadosClientes) {
    // if(!dadosClientes[3].matches("[0-9]+") || !dadosClientes[4].matches("[0-9]+")
    // ||
    // !dadosClientes[5].matches("[0-9]+") || !dadosClientes[6].matches("[0-9]+")) {
    // return false;
    // } else {
    // Cliente c = new Cliente(dadosClientes[1],
    // Integer.parseInt((dadosClientes[2]), dadosClientes[3],
    // dadosClientes[4], dadosClientes[5],
    // Integer.parseInt(dadosClientes[6])));
    // d.inserirEditarCliente(c, Integer.parseInt(dadosClientes[0]));
    // return true;
    // }
    // }
}
