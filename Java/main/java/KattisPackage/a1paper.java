/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KattisPackage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arvid.kagedal
 */
public class a1paper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int smallest = myObj.nextInt();
        List<Integer> papers = new ArrayList<Integer>();
        for (int i = 2;i<=smallest;i++){
            int next = myObj.nextInt();
            papers.add(next);
            
        }
        
        //List<Integer> usedpapers = new ArrayList<Integer>();
        double size = 0;
        double adder;
        double length = 0;
        for(int i = 0; i+1 < smallest;i++){
            adder = Math.pow(0.5, i+1);
            size = size + adder*papers.get(i);
            length = length + Math.pow(2,-5/4);
        }
        
        if(size < 1){
            System.out.println("impossible");
        } else {
            System.out.println(length);
        }
        myObj.close();
       
    }
    
}
