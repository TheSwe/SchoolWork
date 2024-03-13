package KattisPackage;

import java.util.Scanner;

public class ThreeDStaues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int figures = scan.nextInt();
        int madeFigures = 0;
        int capacity = 1;
        int days = 0;
        int capacityadder = 0;
        while (madeFigures < figures){
            for (int i = 0; i<capacity; i++){
                if (capacity < figures){
                    capacityadder ++;
                }
                else{
                    madeFigures ++;
                }
            }
            capacity = capacity+capacityadder;
            capacityadder = 0;
            days++;
        }
        System.out.println(days);
        scan.close();
    }
}
