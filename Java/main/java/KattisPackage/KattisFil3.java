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
public class KattisFil3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String N = myObj.nextLine();
        String[] str = N.split("((?=a))");
        //String strin = String.join("", str);
        int i = 1;
        if (N.charAt(0)=='a'){
            i = 0; 
        }   
        
        for (int abra = i; abra < str.length; abra++){
            System.out.print(str[abra]);
        }
        myObj.close();
    }
    
}
