/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.atividade3;

import java.util.ArrayList;



public class Producao extends Setores{
    
    ArrayList<Pedido> pedidos = new ArrayList<>();
    ArrayList<Funcionarios> funcionarios = new ArrayList<>();
    ArrayList<Funcionarios> gerente = new ArrayList<>();
    
    
    public Producao() {
        
        
    }
    
    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    

    public void adicionarGerente(Funcionarios gerenteAdicionar){
        
        if (gerenteAdicionar.getCargo().equalsIgnoreCase("gerente")) {
            
            gerente.add(gerenteAdicionar);
        }else{
            System.out.println("Adicione apenas alguém com o cargo Gerente");
        }
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
