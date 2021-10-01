package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;

public class TelaBilheteria {
    
    JFrame frame = new JFrame("Bilheteria");
    JPanel painel = new JPanel();
    String [] colunas = {"Lista de Filmes", "Horario", "Sala"}; //Alterar depois no documento
    DefaultTableModel tabelaModelo = new DefaultTableModel(this.colunas, 0);
    JTable tabela = new JTable(tabelaModelo);
    JScrollPane barraRolagem = new JScrollPane(tabela);

    TelaBilheteria(){
        this.painel.setLayout(new GridLayout(1,1));
        this.painel.add(barraRolagem);

        this.frame.getContentPane().add(painel);
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500, 390);
        this.frame.setResizable(true);
        this.frame.setVisible(true);
    }
}
