/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.atividade3;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class TabelaPrecos {
    ArrayList<String> nomeProdutos = new ArrayList<>();
    ArrayList<Double> precoProdutos = new ArrayList<>();
    ArrayList<Double> custoProdutos = new ArrayList<>();


    public TabelaPrecos() {
        
    }
    
    public void adicionarProduto(Funcionarios funcionario,String nomeProduto, double precoProdutos, double custoProdutos){
        if (funcionario.getCargo().equalsIgnoreCase("gerente")) {
            nomeProdutos.add(nomeProduto);
            
        }else{
            System.out.println("Apenas gerentes podem alterar a tabela de preços");
        }
    
        
    }
    
    public void removerProduto(Funcionarios funcionario,int indiceProduto){
        if (funcionario.getCargo().equalsIgnoreCase("gerente")) {
            nomeProdutos.remove(indiceProduto);
            custoProdutos.remove(indiceProduto);
            precoProdutos.remove(indiceProduto);
            
        }else{
            System.out.println("Apenas gerentes podem alterar a tabela de preços");
        }
    }

    public void alterarNome(Funcionarios funcionario,int indiceProduto, String novoNome){
        if (funcionario.getCargo().equalsIgnoreCase("gerente")) {
            System.out.println("Alterado o nomea do produto: "+nomeProdutos.get(indiceProduto));
            nomeProdutos.set(indiceProduto, novoNome);
        }else{
            System.out.println("Apenas gerentes podem alterar a tabela de preços");
        }
    }
    public void alterarPreco(Funcionarios funcionario,int indiceProduto, double novoPreco){
        if (funcionario.getCargo().equalsIgnoreCase("gerente")) {
            precoProdutos.set(indiceProduto, novoPreco);
            System.out.println("Alterado o preco do produto: "+nomeProdutos.get(indiceProduto));
        }else{
            System.out.println("Apenas gerentes podem alterar a tabela de preços");
        }
    }
    public void alterarCusto(Funcionarios funcionario,int indiceProduto, double novoCusto){
        if (funcionario.getCargo().equalsIgnoreCase("gerente")) {
           custoProdutos.set(indiceProduto, novoCusto);
            System.out.println("Alterado o custo do produto: "+nomeProdutos.get(indiceProduto));
        }else{
            System.out.println("Apenas gerentes podem alterar a tabela de preços");
        }
    }
    
   public void verTabela(){
       for(int i =0;i<nomeProdutos.size();i++){
           System.out.println("id: "+ i + "| Nome: "+ nomeProdutos.get(i)+"| Custo de Producao: "+ custoProdutos.get(i)+"Preco: "+ precoProdutos.get(i));
       }
   }

    public ArrayList<String> getNomeProdutos() {
        return nomeProdutos;
    }

    public void setNomeProdutos(ArrayList<String> nomeProdutos) {
        this.nomeProdutos = nomeProdutos;
    }

    public ArrayList<Double> getPrecoProdutos() {
        return precoProdutos;
    }

    public void setPrecoProdutos(ArrayList<Double> precoProdutos) {
        this.precoProdutos = precoProdutos;
    }

    public ArrayList<Double> getCustoProdutos() {
        return custoProdutos;
    }

    public void setCustoProdutos(ArrayList<Double> custoProdutos) {
        this.custoProdutos = custoProdutos;
    }
    
    
    
    
    
}
