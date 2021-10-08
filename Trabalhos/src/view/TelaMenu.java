package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controle.*;

public class TelaMenu implements ActionListener {

    private static JFrame frame = new JFrame();
    private static JLabel label = new JLabel();
    private static JButton pessoa = new JButton("Pessoa");
    private static JButton bilheteria = new JButton("Bilheteria");
    public static ControleDados dados = new ControleDados();

    public TelaMenu() {

        //Criando a label do titulo
        label.setText("Menu Principal");
        label.setForeground(new Color(0x4B0082));
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(320, 30, 190, 60);

        //Botão para selecionar cliente ou fundionário
        pessoa.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        pessoa.setBounds(310, 160, 180, 40);

        //Botão da bilheteria
        bilheteria.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        bilheteria.setBounds(310, 100, 180, 40);

        //Janela principal
        frame.add(label);
        frame.add(pessoa);
        frame.add(bilheteria);
        
        frame.setTitle("Cinema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TelaMenu menu = new TelaMenu();

        pessoa.addActionListener(menu);
        bilheteria.addActionListener(menu);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == pessoa)
            new TelaPessoa().mostrarDados(dados,1);
            // TelaSessao viewSessao = new TelaSessao();
            // JOptionPane.showMessageDialog(null,
            //         "As funcionalidades ainda precisam ser aplicadas\n" + "relacionadas a sessões", null,
            //         JOptionPane.INFORMATION_MESSAGE);

        if (src == bilheteria)
            new TelaBilheteria();
    }
}
