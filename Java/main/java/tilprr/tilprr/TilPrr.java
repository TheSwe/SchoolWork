/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tilprr.tilprr;

//@author arvid.kagedal

import java.util.Scanner;


public class TilPrr {

    public static void main(String[] args) {
        float a = 2;
        float b = 4;
        double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        System.out.println(c);
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print(x);
        scan.close();
    }
}
