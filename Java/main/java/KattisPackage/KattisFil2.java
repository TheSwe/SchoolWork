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
public class KattisFil2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        
        for (int abra = 1; abra <= N; abra++){
            System.out.println(abra+" Abracadabra");
        } 
        myObj.close();  
    }
}
