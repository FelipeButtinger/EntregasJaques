/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.atividade1;

/**
 *
 * @author felip
 */
public class Invoice {
    int itemNumber;
    String description;
    int itemQuantity;
    double itemPrice;
    
    public Invoice(int itemNumber, String description, int itemQuantity, double itemPrice) {
        this.itemNumber = itemNumber;
        this.description = description;
        
        if(itemQuantity<0){
            this.itemQuantity = 0;
        }else{
            this.itemQuantity = itemQuantity;
        }
        if(itemPrice<0){
            this.itemPrice = 0.0;
        }else{
            this.itemPrice = itemPrice;
        }
        
    }
    
    public double Calculo(){
    double fatura = this.itemQuantity * this.itemPrice;
    return fatura;
    }
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}


