/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.atividade3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 05750329011
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criando os funcionarios
       Funcionarios empregado1 = new Funcionarios("João", 25, 2500.00, "vendas", "Empregado");
        Funcionarios empregado2 = new Funcionarios("Maria", 30, 2800.00, "vendas", "Empregado");

        Funcionarios empregado3 = new Funcionarios("Pedro", 28, 2600.00, "producao", "Empregado");
        Funcionarios empregado4 = new Funcionarios("Ana", 32, 2900.00, "producao", "Empregado");

        Funcionarios empregado5 = new Funcionarios("Carlos", 27, 2700.00, "financeiro", "Empregado");
        Funcionarios empregado6 = new Funcionarios("Juliana", 35, 3000.00, "financeiro", "Empregado");

        //Criando gerentes
        Funcionarios gerenteVendas = new Funcionarios("Fernando", 40, 5000.00, "vendas", "Gerente");
        Funcionarios gerenteProducao = new Funcionarios("Mariana", 45, 5500.00, "producao", "Gerente");
        Funcionarios gerenteFinanceiro = new Funcionarios("Roberto", 50, 6000.00, "financeiro", "Gerente");
        
        //criando os setores
        Financeiro setorFinanceiro = new Financeiro();
        Producao setorProducao = new Producao();
        Vendas setorVendas = new Vendas();
        
        //criar a tabela de Precos
        TabelaPrecos tabelaPrecos = new TabelaPrecos();
        
        //Adicionando alguns produtos na tabela
       
        tabelaPrecos.adicionarProduto(gerenteVendas, "Livro", 25.0, 5.0);
        tabelaPrecos.adicionarProduto(gerenteVendas, "Panfleto", 1.0, 8.0);
        tabelaPrecos.adicionarProduto(gerenteFinanceiro, "Banner", 20.0, 12.0);
        
        //tabelaPrecos.verTabela();//não funcionou
        
        tabelaPrecos.alterarCusto(gerenteVendas, 0, 30.0);


        //Adicionando a tabela criada nos setores que precisam
        setorVendas.adicionarTabela(tabelaPrecos);
        setorFinanceiro.adicionarTabela(tabelaPrecos);
        
        
        //adicionando os funcionarios em seus respectivos setores criados
        setorVendas.adicionarFuncionario(empregado1);
        setorVendas.adicionarFuncionario(empregado2);
        
        setorProducao.adicionarFuncionario(empregado3);
        setorProducao.adicionarFuncionario(empregado4);
        
        setorFinanceiro.adicionarFuncionario(empregado5);
        setorFinanceiro.adicionarFuncionario(empregado6);
        
        //adicionando os gerentes em seus respectivos setores
        setorVendas.adicionarGerente(gerenteVendas);
        
        setorProducao.adicionarGerente(gerenteProducao);
        
        setorFinanceiro.adicionarGerente(gerenteFinanceiro);
        
        
        //Criando Pedidos
        Pedido pedido1 = new Pedido("Livro", 3, 25.0, empregado1);
        Pedido pedido2 = new Pedido("Panfleto", 10, 1.0, empregado2);
        Pedido pedido3 = new Pedido("Banner", 2, 20.0, empregado2);
        
        
    }
    
    
    
    
}
