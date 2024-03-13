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
public class nintynineproblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        
        int y=x%100;
        
        int add = 99-y;
        
        int sub = (-1-y)*-1;
        if (x<100){
            sub = 100;
        }
        //System.out.println(sub);
        //System.out.println(add);
        if (add<=sub){
            System.out.print(x+add);
        } else{
            System.out.print(x-sub);
        }
        myObj.close();
    }
    
}
