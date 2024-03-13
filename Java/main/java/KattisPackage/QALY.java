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
public class QALY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        float tot = 0;
        for (int i = 0; i < x; i++){
            float y = myObj.nextFloat();
            float z = myObj.nextFloat();
            tot = tot + y*z;
        }
        System.out.print(tot);
        myObj.close();
    }
    
}
