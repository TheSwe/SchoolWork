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
public class KattisFil5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int A = myObj.nextInt();
        int B = myObj.nextInt();
        int Arev = 0;
        int Brev = 0;
        int Ait = 0;
        int Bit = 0;
        
        while (A!=0){
            Ait = A%10;
            Arev = 10*Arev + Ait;
            A = A/10;
            Bit = B%10;
            Brev = 10*Brev + Bit;
            B = B/10;
        }
        System.out.println(Integer.toString(Arev>Brev ? Arev:Brev));
        myObj.close();
    }
    
}
