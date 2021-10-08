package view;

import java.awt.event.*;
import javax.swing.*;
import controle.ControleDados;

public class TelaDetalhePessoa implements ActionListener {

    private JFrame frame;
    private JLabel labelNome = new JLabel("Nome: ");
    private JTextField valorNome;
    private JLabel labelCPF = new JLabel("CPF: ");
    private JTextField valorCPF;
    // private JLabel labelDataNasc = new JLabel("Data de Nascimento: ");
    // private JTextField valorDataNasc;
    private JLabel labelCidade = new JLabel("Cidade: ");
    private JTextField valorCidade;
    private JLabel labelEstado = new JLabel("Estado: ");
    private JTextField valorEstado;
    private JLabel labelEmail = new JLabel("Email: ");
    private JTextField valorEmail;
    private JButton botaoExcluir = new JButton("Excluir");
    private JButton botaoSalvar = new JButton("Salvar");
    private String[] novoDado = new String[9];
    private static ControleDados dados;
    private int posicao;
    private int opcao;
    private String s;

    public void inserirEditar(int op, ControleDados d, TelaPessoa p, int pos) {

        opcao = op;
        posicao = pos;
        dados = d;

        if (op == 1) s = "Cadastro de Cliente";
        if (op == 2) s = "Detalhe de Cliente";

        frame = new JFrame(s);

        // Preencher dados do cliente clicado
        if (op == 2) {

            valorNome = new JTextField(dados.getClientes()[pos].getNome(), 200);
            valorCPF = new JTextField(String.valueOf(dados.getClientes()[pos].getCPF()));
            valorCidade = new JTextField(dados.getClientes()[pos].getCidade(), 200);
            valorEstado = new JTextField(dados.getClientes()[pos].getEstado(), 200);
            valorEmail = new JTextField(dados.getClientes()[pos].getEmail(), 200);

        } else { // Não preenche com dados

            valorNome = new JTextField(200);
            valorCPF = new JTextField(200);
            valorCidade = new JTextField(200);
            valorEstado = new JTextField(200);
            valorEmail = new JTextField(200);

            botaoSalvar.setBounds(245, 175, 115, 30);

        }

        labelNome.setBounds(30, 20, 150, 25);
        valorNome.setBounds(180, 20, 180, 25);
        labelCPF.setBounds(30, 50, 150, 25);
        valorCPF.setBounds(180, 50, 180, 25);
        labelCidade.setBounds(30, 80, 180, 25);
        valorCidade.setBounds(180, 80, 180, 25);
        labelEstado.setBounds(30, 110, 150, 25);
        valorEstado.setBounds(180, 110, 180, 25);
        labelEmail.setBounds(30, 140, 150, 25);
        valorEmail.setBounds(180, 140, 180, 25);

        if (op == 2) {
            botaoSalvar.setBounds(120, 175, 115, 30);
            botaoExcluir.setBounds(245, 175, 115, 30);
            this.frame.add(botaoExcluir);
        }

        this.frame.add(labelNome);
        this.frame.add(valorNome);
        this.frame.add(labelCPF);
        this.frame.add(valorCPF);
        this.frame.add(labelCidade);
        this.frame.add(valorCidade);
        this.frame.add(labelEstado);
        this.frame.add(valorEstado);
        this.frame.add(labelEmail);
        this.frame.add(valorEmail);

        this.frame.setLayout(null);

        this.frame.setSize(400, 250);
        this.frame.setVisible(true);

        botaoSalvar.addActionListener(this);
        botaoExcluir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == botaoSalvar) {
            try{
                boolean res;
                if(opcao == 1) { // Cadastro de Cliente
                    novoDado[0] = Integer.toString(dados.getQntClientes());
                }else { // Edicao de dado existente
                    novoDado[0] = Integer.toString(posicao);
                }

                novoDado[1] = valorNome.getText();
                novoDado[2] = valorCPF.getText();
                novoDado[3] = valorCidade.getText();
                novoDado[4] = valorEstado.getText();
                novoDado[5] = valorEmail.getText();

            } catch (NullPointerException exc1) {
                mensagemErroCadastro();
            } catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
        }  

        if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 2) {//exclui Cliente
				// res = dados.removerCliente(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoCliente(); 
			}	
		}
    }

    public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		frame.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		frame.dispose();
	}

    public void mensagemErroCadastro() {
        JOptionPane.showMessageDialog(null, "ERROR AO SALVAR OS DADOS \n"
        + "Pode ter ocorrido um dos erros a seguir: \n"
        + "1. Nem todos os campos foram preenchidos\n"
        + "2. CPF não contém só números", null, JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemErroExclusaoCliente() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o cliente est� matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}
