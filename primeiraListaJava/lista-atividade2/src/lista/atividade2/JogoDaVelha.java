/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.atividade2;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class JogoDaVelha {
    private int[][] jogo = new int[3][3];
    private int jogador = 0;
    private Scanner leitor = new Scanner(System.in);
    
    public JogoDaVelha() {
        
        this.jogo[0][0] = 0;
        this.jogo[0][1] = 0;
        this.jogo[0][2] = 0;
        this.jogo[1][0] = 0;
        this.jogo[1][1] = 0;
        this.jogo[1][2] = 0;
        this.jogo[2][0] = 0;
        this.jogo[2][1] = 0;
        this.jogo[2][2] = 0;
    }

    public int[][] getJogo() {
        return jogo;
    }

    public void setJogo(int[][] jogo) {
        this.jogo = jogo;
    }
    
    
    public void iniciarJogo(){

        int linha = 0;
        int coluna = 0;
        
        int[] casas = new int[]{};
        System.out.println("Este é o início do jogo, jogador 1 começa jogando");
        System.out.println("escolha a linha que sua casa de escolha pertence. Ex: 1.");
        linha = leitor.nextInt();
        System.out.println("escolha a coluna que sua casa de escolha pertence. Ex: 1.");
        coluna = leitor.nextInt();
        
        this.jogo[linha-1][coluna-1] = 1;
        
        System.out.println("você ocupou a linha: "+linha+" e a coluna: "+coluna);
        jogador++;
       imprimirJogoJogar();
}
    public void jogar(){
        
         int linha = 0;
        int coluna = 0;
        
        if (jogador % 2 == 0) {
            System.out.println("Vez do jogador 1, escolha a linha de sua casa");
            linha = leitor.nextInt();
            System.out.println("Agora escolha a coluna");
            coluna = leitor.nextInt();
        }else{
            System.out.println("Vez do jogador 2, escolha a linha de sua casa");
            linha = leitor.nextInt();
            System.out.println("Agora escolha a coluna");
            coluna = leitor.nextInt();
        }
        if(this.jogo[linha][coluna] == 0){    
            System.out.println("você ocupou a linha: "+linha+" E a coluna: "+coluna);
                    if (jogador % 2 == 0) {
                        this.jogo[linha-1][coluna-1] = 1;
                    }else{
            this.jogo[linha-1][coluna-1] = 2;
                     }}else{
        System.out.println("Esta casa já está ocupada. Tente novamente.");
        imprimirJogoJogar();
        }
        jogador++;
        verificarJogadas();
    }
    public void verificarJogadas(){
       boolean win = false;
       boolean draw = true;
       
    if(this.jogo[0][0] == this.jogo[0][1] && this.jogo[0][0] == this.jogo[0][2]){
        System.out.println("Jogador:" + this.jogo[0][0] + "Ganhou !!");
        win = true;
    } // linha do topo 00-01-02
    
    else if(this.jogo[1][0] == this.jogo[1][1] && this.jogo[1][0] == this.jogo[1][2]){
        System.out.println("Jogador:" + this.jogo[1][0] + "Ganhou !!");
        win = true;
    } // linha do meio 10-11-12
    
    else if(this.jogo[2][0] == this.jogo[2][1] && this.jogo[2][0] == this.jogo[2][2]){
        System.out.println("Jogador:" + this.jogo[2][0] + "Ganhou !!");
        win = true;
    } // linha de baixo 20-21-22
    
    else if(this.jogo[0][0] == this.jogo[1][0] && this.jogo[0][0] == this.jogo[2][0]){
        System.out.println("Jogador:" + this.jogo[0][0] + "Ganhou !!");
        win = true;
    } // coluna da esquerda 00-10-20
    
    else if(this.jogo[0][1] == this.jogo[1][1] && this.jogo[0][1] == this.jogo[2][1]){
        System.out.println("Jogador:" + this.jogo[0][1] + "Ganhou !!");
        win = true;
    }// coluna do meio 01-11-21
    
    else if(this.jogo[0][2] == this.jogo[1][2] && this.jogo[0][2] == this.jogo[2][2]){
        System.out.println("Jogador:" + this.jogo[0][2] + "Ganhou !!"); 
        win = true;
    }// coluna da direita 02-12-22
    
    else if(this.jogo[0][0] == this.jogo[1][1] && this.jogo[0][0] == this.jogo[2][2]){
        System.out.println("Jogador:" + this.jogo[0][0] + "Ganhou !!"); 
        win = true;
    }//diagonal topoEsquerda->baixoDireita 00-11-22
    
    else if(this.jogo[0][2] == this.jogo[1][1] && this.jogo[0][2] == this.jogo[2][0]){
        System.out.println("Jogador:" + this.jogo[0][2] + "Ganhou !!"); 
        win = true;
    }//diagonal baixoEsquerda->topoDireita 02-11-20
    
    
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (this.jogo[i][j] == 0) {
                draw = false; // Se encontrarmos pelo menos um espaço vazio, não é empate
                break;
            }
        }
    
    }//se todos os números forem diferentes de 0 = empate
     if(draw = true){
         System.out.println("Jogo encerrado em empate");
         imprimirJogo();
         
     }else if(win = true){
         System.out.println("fim de jogo");
         imprimirJogo();
       
     } else{
                imprimirJogoJogar();
     }
    }
    
    
    public void imprimirJogo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.jogo[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void imprimirJogoJogar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.jogo[i][j] + " ");
            }
            System.out.println();
        }
        jogar();
    }
    
}


