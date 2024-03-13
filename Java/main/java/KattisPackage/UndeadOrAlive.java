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
public class UndeadOrAlive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String N = myObj.nextLine();
        boolean contSmile = N.contains(":)");
        boolean contSad = N.contains(":(");
        
        if (contSmile == true && contSad == true){
            System.out.println("double agent");
    }   else if (contSmile == true && contSad == false){
            System.out.println("alive");
    }   else if (contSmile == false && contSad == true){
            System.out.println("undead");
    }   else{
            System.out.println("machine");
    }
    myObj.close();
    }
    
}
