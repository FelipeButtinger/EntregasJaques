/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.atividade3;

/**
 *
 * @author 05750329011
 */
public class Funcionarios {
    String nome;
    int idade;
    double salario;
    String setor;
    String Cargo;

    public Funcionarios(String nome, int idade, double salario, String setor, String Cargo) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.setor = setor;
        this.Cargo = Cargo;
        
    }

    
    
    
    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    String cpf;
}
