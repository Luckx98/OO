package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class TelaMenu implements ActionListener {

    private static JFrame janela = new JFrame("Cinema");
    private static JLabel titulo = new JLabel("Menu Principal");
    private static JButton sessao = new JButton("Sessoes");
    private static JButton bilheteria = new JButton("Bilheteria");

    public TelaMenu() {
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        sessao.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        bilheteria.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));

        titulo.setBounds(330, 30, 180, 50);
        sessao.setBounds(330, 160, 180, 50);
        bilheteria.setBounds(330, 100, 180, 50);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(sessao);
        janela.add(bilheteria);

        janela.setSize(800, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        TelaMenu menu = new TelaMenu();

        sessao.addActionListener(menu);
        bilheteria.addActionListener(menu);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == sessao)
            JOptionPane.showMessageDialog(null,
                "As funcionalidades ainda precisam ser aplicadas\n" 
                + "relacionadas a sessões", null,
                JOptionPane.INFORMATION_MESSAGE);

        if (src == bilheteria)
            JOptionPane.showMessageDialog(null,
                "As funcionalidades ainda precisam ser aplicadas\n" 
                + "relacionadas a bilheteria", null,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
