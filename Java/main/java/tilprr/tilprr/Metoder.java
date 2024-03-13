/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tilprr.tilprr;
import java.util.*;
/**
 *
 * @author arvid.kagedal
 */
public class Metoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isEven(34));
        System.out.println(circleArea(1));
        System.out.println(circleArea(1.01));
        int[] ar = {1,2,3,4};
        printAr(ar);
        getWords("ord1 ord2 ord3 ord4",1,3);
        getWords("ord1 ord2 ord3 ord4",1);
        
    }
    public static boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }
    public static double circleArea(double rad){
        return Math.pow(rad,2)*Math.PI;
    }
    public static double circleArea(int rad){
        return Math.pow(rad,2)*Math.PI;
    }
    public static void printAr(int[] ar){
        System.out.println(Arrays.toString(ar));
        
    }
    public static void getWords(String ar, int index){
        getWords(ar,index,1);
    }
    public static void getWords(String words, int index, int length){
        String[] arr = words.split(" ");
        for (int i = index;i<=length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
