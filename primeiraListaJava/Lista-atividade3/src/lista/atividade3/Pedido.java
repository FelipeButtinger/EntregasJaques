/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.atividade3;

import java.util.Date;
/**
 *
 * @author 05750329011
 */
public class Pedido {
    String produto;
    int quantidade;
    double precoTotal;
    Funcionarios funcionarioVenda ;
    Funcionarios funcionarioProducao ;
    Date horaEmissao;
    Date horaFinalizacao;

    public String getProduto() {
        return produto;
    }

    public Pedido(String produto, int quantidade, double precoUnidade, Funcionarios funcionarioVenda) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoTotal = precoUnidade*quantidade;
        this.funcionarioVenda = funcionarioVenda;
        this.horaEmissao = new Date();
        
       
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnidade() {
        return precoTotal;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.precoTotal = precoUnidade;
    }

    public Funcionarios getFuncionarioVenda() {
        return funcionarioVenda;
    }

    public void setFuncionarioVenda(Funcionarios funcionarioVenda) {
        this.funcionarioVenda = funcionarioVenda;
    }

    public Funcionarios getFuncionarioProducao() {
        return funcionarioProducao;
    }

    public void setFuncionarioProducao(Funcionarios funcionarioProducao) {
        this.funcionarioProducao = funcionarioProducao;
    }

    public Date getHoraEmissao() {
        return horaEmissao;
    }

    public void setHoraEmissao(Date horaEmissao) {
        this.horaEmissao = horaEmissao;
    }

    public Date getHoraFinalizacao() {
        return horaFinalizacao;
    }

    public void setHoraFinalizacao(Date horaFinalizacao) {
        this.horaFinalizacao = horaFinalizacao;
    }

    
    
     public void atribuirProducao(Funcionarios funcionariosProducao) {
        
            if ("producao".equals(funcionariosProducao.getSetor())) {
                this.funcionarioProducao = funcionariosProducao;
            }else{
                System.out.println("Você precisa designar um funcionário do setor de producao");
            
        }
         
        
    }
     public void finalizarPedido(){
     this.horaFinalizacao = new Date();
         System.out.println(horaFinalizacao);
    }
    
}
