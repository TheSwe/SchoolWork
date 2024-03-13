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
public class Quadrant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        
        if (x > 0){
            if(y > 0){
                System.out.print("1");
            }
            else{
                System.out.print("4");
            }
        } else {
            if (y > 0){
                System.out.print("2");
            } else {
                System.out.print("3");
            }
        }
        myObj.close();
        
    }
    
}
