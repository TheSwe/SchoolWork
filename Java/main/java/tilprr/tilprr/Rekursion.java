package tilprr.tilprr;

public class Rekursion {
    public static void main(String[] args) {
        System.out.println(fakultet(5));
    }
    public static long fakultet(long number){
        if (number == 1){
            return(number);
        } else {
            return number*(fakultet(number-1));
        }
    }
}
