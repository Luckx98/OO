package modelo;

import java.util.*;

public class Dados {
    private Cliente[] clientes = new Cliente[30];
    private int qntClientes = 0;
    private Filme[] filmes = new Filme[30];
    private int qntFilmes = 0;
    private Funcionario[] funcionarios = new Funcionario[10];
    private int qntFuncionarios = 0;
    private Ingresso[] ingressos = new Ingresso[30];
    private int qntIngressos = 0;

    public void fillWithSomeData(){
        Date d = Calendar.getInstance().getTime();
        for (int i = 0; i < 5; i++) {
            ingressos[i] = new Ingresso("Filme Tal", (i+1)*10.00, "Poltrona"+i, (i+1)*10);
            clientes[i] = new Cliente("Cliente"+i, d, "Cidade"+i,"Estado"+i, "Email"+i, (i+1)*123456);
            funcionarios[i] = new Funcionario("Funcionario"+i, (i+1)*123456, (i+1)*12, "Turno"+i);
            filmes[i] = new Filme("Nome do Filme:"+i, d, (i+1)*10.00, "Genero"+i, "Idioma"+i);
        }

        setQntClientes(5);
        setQntFilmes(5);
        setQntFuncionarios(5);
        setQntIngressos(5);
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Filme[] getFilmes() {
        return filmes;
    }

    public void setFilmes(Filme[] filmes) {
        this.filmes = filmes;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Ingresso[] getIngressos() {
        return ingressos;
    }

    public void setIngressos(Ingresso[] ingressos) {
        this.ingressos = ingressos;
    }

    public int getQntIngressos() {
        return qntIngressos;
    }

    public void setQntIngressos(int qntIngressos) {
        this.qntIngressos = qntIngressos;
    }

    public int getQntFuncionarios() {
        return qntFuncionarios;
    }

    public void setQntFuncionarios(int qntFuncionarios) {
        this.qntFuncionarios = qntFuncionarios;
    }

    public int getQntFilmes() {
        return qntFilmes;
    }

    public void setQntFilmes(int qntFilmes) {
        this.qntFilmes = qntFilmes;
    }

    public int getQntClientes() {
        return qntClientes;
    }

    public void setQntClientes(int qntClientes) {
        this.qntClientes = qntClientes;
    }
}
