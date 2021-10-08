package controle;
import modelo.*;

public class ControleClientes {
    private Cliente[] c;
    private int qntClientes;

    public ControleClientes(ControleDados d) {
        c = d.getClientes();
        qntClientes = d.getQntClientes();
    }
}
