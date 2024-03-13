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
public class R2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        
        System.out.print(y*2-x);
        myObj.close();
    }
    
}
