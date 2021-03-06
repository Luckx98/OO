package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controle.ControleClientes;
import controle.ControleDados;

public class TelaPessoa implements ActionListener, ListSelectionListener {
    private JFrame frame;
    private JLabel titulo;
    private JButton cadastroCliente;
    private JButton refreshCliente;
    // private JButton cadastroFunc;
    // private JButton refreshFunc;
    private static ControleDados dados;
    private JList<String> listaClienteCadastrados;
    // private JList<String> listaFuncCadastrados;
    private String[] listaNomes = new String[59];

    public void mostrarDados(ControleDados d, int op) {
        dados = d;

        switch (op) {
            case 1:
                listaNomes = new ControleClientes(dados).getNomeClientes();
                listaClienteCadastrados = new JList<String>(listaNomes);
                frame = new JFrame("Cliente");
                titulo = new JLabel("Clientes Cadastrados");
                cadastroCliente = new JButton("Cadastrar");
                refreshCliente = new JButton("Refresh");

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaClienteCadastrados.setBounds(20, 50, 350, 120);
                listaClienteCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaClienteCadastrados.setVisibleRowCount(10);

                cadastroCliente.setBounds(70, 177, 100, 30);
                refreshCliente.setBounds(200, 177, 100, 30);

                frame.setLayout(null);

                frame.add(titulo);
                frame.add(listaClienteCadastrados);
                frame.add(cadastroCliente);
                frame.add(refreshCliente);

                frame.setSize(400, 250);
                frame.setVisible(true);

                cadastroCliente.addActionListener(this);
                refreshCliente.addActionListener(this);
                listaClienteCadastrados.addListSelectionListener(this);

                break;

            default:
                JOptionPane.showMessageDialog(null, "Op????o n??o encontrada!", null, JOptionPane.ERROR_MESSAGE);

        }
    }

    // Captura eventos relacionados aos bot??es da interface
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        // Cadastro de novo cliente
        if (src == cadastroCliente) {
            new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);
        }
        // Atualiza a lista de nomes de alunos mostrado no JList
        if (src == refreshCliente) {
            listaClienteCadastrados.setListData(new ControleClientes(dados).getNomeClientes());
            listaClienteCadastrados.updateUI();
        }
    }

    // Captura eventos relacionados ao JList
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaClienteCadastrados) {
            new TelaDetalhePessoa().inserirEditar(3, dados, this, listaClienteCadastrados.getSelectedIndex());
        }

    }

}
