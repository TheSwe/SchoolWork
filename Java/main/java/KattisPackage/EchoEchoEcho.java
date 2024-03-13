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
public class EchoEchoEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String x = myObj.nextLine();
        
        for(int i = 0;i<2;i++){
            System.out.print(x+" ");
        }
        System.out.print(x);
        myObj.close();
    }
    
}
