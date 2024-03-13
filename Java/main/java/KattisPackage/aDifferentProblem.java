package KattisPackage;
import java.util.Scanner;
public class aDifferentProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            try{
                long A = scan.nextLong();
                long B = scan.nextLong();
                if (A<B){
                    System.out.println(B-A);
                } else{
                    System.out.println(A-B);
                }
            } catch(Exception e){
                break;
            }
        }
        scan.close();
    }
}
