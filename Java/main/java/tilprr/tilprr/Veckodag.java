/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tilprr.tilprr;

import java.util.Scanner;

/**
 *
 * @author arvid.kagedal
 */
public class Veckodag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int idag = myObj.nextInt();
        int dagar = myObj.nextInt();
        
        int moddagar = (idag+dagar)%7;
        
        switch(moddagar){
            case 1:
                System.out.println("Om "+dagar+" dagar är det måndag");
                break;
            case 2:
                System.out.println("Om "+dagar+" dagar är det tisdag");
                break;
            case 3:
                System.out.println("Om "+dagar+" dagar är det onsdag");
                break;
            case 4:
                System.out.println("Om "+dagar+" dagar är det torsdag");
                break;
            case 5:
                System.out.println("Om "+dagar+" dagar är det fredag");
                break;
            case 6:
                System.out.println("Om "+dagar+" dagar är det lördag");
                break;
            case 0:
                System.out.println("Om "+dagar+" dagar är det söndag");
                break;
        }
        myObj.close();
    }
    
}
