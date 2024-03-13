/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KattisPackage;

import java.util.Scanner;

/**
 *
 * @author arvid.kagedal
 */
public class KattisFil4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int pizzaR = myObj.nextInt();
        int crustR = myObj.nextInt();
        
        
        double pizzarea = Math.PI*Math.pow(pizzaR,2);
        double cheesearea = Math.PI*Math.pow(pizzaR-crustR,2);
        
        
        
        System.out.print((cheesearea/pizzarea)*100);
        myObj.close();       
    }
    
}
