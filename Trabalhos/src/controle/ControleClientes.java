package controle;

import modelo.*;

public class ControleClientes {
    private Cliente[] c;
    private int qntClientes;

    public ControleClientes(ControleDados d) {
        setC(d.getClientes());
        setQntClientes(d.getQntClientes());
    }

    public String[] getNomeClientes() {
        String[] s = new String[qntClientes];
        for (int i = 0; i < qntClientes; i++) {
            s[i] = c[i].getNome();
        }
        return s;
    }

    // public boolean inserirEditarCliente(String[] dadosClientes) {
    //     if (!dadosClientes[3].matches("[0-9]+") || !dadosClientes[4].matches("[0-9]+")
    //             || !dadosClientes[5].matches("[0-9]+") || !dadosClientes[6].matches("[0-9]+")) {
    //         return false;
    //     } else {
    //         Cliente c = new Cliente(dadosClientes[1], Integer.parseInt(s)[2], dadosClientes[3], dadosClientes[4],
    //                 dadosClientes[5], Integer.parseInt(dadosClientes[6]));
    //         c.inserirEditarCliente(c, Integer.parseInt(dadosClientes[0]));
    //         return true;
    //     }
    // }

    public int getQntClientes() {
        return qntClientes;
    }

    public void setQntClientes(int qntClientes) {
        this.qntClientes = qntClientes;
    }

    public Cliente[] getC() {
        return c;
    }

    public void setC(Cliente[] c) {
        this.c = c;
    }
}
