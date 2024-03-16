/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.atividade3;

import java.util.ArrayList;

/**
 *
 * @author 05750329011
 */
public class Vendas extends Setores{
    
    ArrayList<Pedido> pedidos = new ArrayList<>();
    TabelaPrecos tabelaPrecos;
    ArrayList<Funcionarios> funcionarios = new ArrayList<>();
    ArrayList<Funcionarios> gerente = new ArrayList<>();
    
    public Vendas() {
        
    }
    public void adicionarGerente(Funcionarios gerenteAdicionar){
        
        if (gerenteAdicionar.getCargo().equalsIgnoreCase("gerente")) {
            
            gerente.add(gerenteAdicionar);
        }else{
            System.out.println("Adicione apenas alguém com o cargo Gerente");
        }
    }
    
    public void adicionarTabela(TabelaPrecos tabela){
        tabelaPrecos = tabela;
        

    }
    public void adicionarFuncionario(Funcionarios novoFuncionario){
        funcionarios.add(novoFuncionario);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public TabelaPrecos getTabelaPrecos() {
        return tabelaPrecos;
    }

    public void setTabelaPrecos(TabelaPrecos tabelaPrecos) {
        this.tabelaPrecos = tabelaPrecos;
    }

    public ArrayList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Funcionarios> getGerente() {
        return gerente;
    }

    public void setGerente(ArrayList<Funcionarios> gerente) {
        this.gerente = gerente;
    }
    
    }

    
    

