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
public class Greetings {

    
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String N = myObj.nextLine();
        
        System.out.print("h");
        for (int i = 0; i < N.length(); i++){
            if ('e' == N.charAt(i)){
                System.out.print("ee");
            }
        }
        
       
    
        System.out.print("y");
        myObj.close();
    }
    
}
