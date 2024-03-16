/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.atividade1;

/**
 *
 * @author felip
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Invoice Mouse = new Invoice(1, "Mouse sem fio", 3, 180.5);
       Invoice grãoDeArroz = new Invoice(2, "Apenas um grão de arroz", 25, -0.2);
       
       System.out.println("Detalhes do Mouse:");
        System.out.println("Número do item: " + Mouse.getItemNumber());
        System.out.println("Descrição: " + Mouse.getDescription());
        System.out.println("Quantidade de itens: " + Mouse.getItemQuantity());
        System.out.println("Preço por item: " + Mouse.getItemPrice());
        System.out.println("Total da fatura: " + Mouse.Calculo());

        System.out.println();

        System.out.println("Detalhes do grão de arroz:");
        System.out.println("Número do item: " + grãoDeArroz.getItemNumber());
        System.out.println("Descrição: " + grãoDeArroz.getDescription());
        System.out.println("Quantidade de itens: " + grãoDeArroz.getItemQuantity());
        System.out.println("Preço por item: " + grãoDeArroz.getItemPrice());
        System.out.println("Total da fatura: " + grãoDeArroz.Calculo());
       
       
    }
    
}
