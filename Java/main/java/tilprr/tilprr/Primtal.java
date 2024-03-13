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
public class Primtal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean invalid =true;
        int numberOfNums = 0;
        while (invalid){
            try{
                numberOfNums = Integer.parseInt(scan.nextLine());
                invalid = false;
            }
            catch(NumberFormatException e){
                System.out.println("Int required, try again");
            }
        }
        
        int[] numbers = new int[numberOfNums];
        invalid =true;
        while(invalid){
            try{
                for (int i=0; i<numberOfNums; i++){
                    numbers[i] = scan.nextInt();
                }
                invalid = false;
            }
            catch(Exception e){
                System.out.println("Int(s) required, try again");
                scan.nextLine();
            }
        }
        long time = System.currentTimeMillis();
        long nano = System.nanoTime();
        int number;
        for (int i=0; i<numberOfNums; i++){
            number = numbers[i];
            System.out.println(number+" is "+((primeNum(number)) ? "":"not ")+ "a prime number");
        }
        System.out.println("NanoTime"+(System.nanoTime()-nano));
        System.out.println("Milliseconds"+(System.currentTimeMillis()-time));
        scan.close();
        
    }
    public static boolean primeNum(int tal){
        
        if (tal == 2|| tal == 3||tal == 5|| tal == 7||tal == 11|| tal == 13||tal == 17||tal == 19|| tal == 23||tal == 29){
            return true;
        }
        if (tal <= 1||tal%2 == 0||tal%3 == 0||tal%5 == 0){
            return false;
        }
        for (int i = 31; i<=Math.pow(tal,0.5 ); i = i+30){
            if (tal%i == 0||tal%i+6 == 0||tal%i+10 == 0||tal%i+12 == 0||tal%i+16 == 0||tal%i+18 == 0||tal%i+22 == 0||tal%i+28 == 0){
                
                return false;
            }
        }
        return true;
    }

}
