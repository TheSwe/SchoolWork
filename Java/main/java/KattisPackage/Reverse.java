/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KattisPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author arvid.kagedal
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int smallest = myObj.nextInt();
        List<Integer> papers = new ArrayList<Integer>();
        for (int i = 0;i<smallest;i++){
            int next = myObj.nextInt();
            papers.add(next);  
        }
        for (int i = smallest-1; i>=0; i--){
            System.out.println(papers.get(i));
        }
        myObj.close();
    }
    
}
