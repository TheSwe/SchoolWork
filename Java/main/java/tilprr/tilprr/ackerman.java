/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tilprr.tilprr;

/**
 *
 * @author andreas.andersson
 */
public class ackerman {

    public static void main(String[] args) {
        countTo(1,10);
        
        //a) fakultet är 1*2*3*...*n
        //Gör den recursiva metoden fakultet. testa de två anropen nedan
        //fakultet(3); // --> 3*2*1 = 6
        //fakultet(5); // --> 5*4*3*2*1 = 120
        //Vad finns det för begränsningar med denna metoden?
        
        //System.out.println(fakultet(5));
        
        //b) Testa ack med olika värden.
        //Läss på om "the Ackermann function"

        //System.out.println(ack(4,2));
    }
    public static long fakultet(long number){
        if (number == 1){
            return(number);
        } else {
            return number*(fakultet(number-1));
        }
    }
    private static void countTo(int from, int to) {
        if(from <= to){
            System.out.println(from);
            countTo(from+1, to); //recursion
        }
    }

    
    static int ack(int m, int n)
    {
        if (m == 0)
        {
            return n + 1;
        }
        else if((m > 0) && (n == 0))
        {
            return ack(m - 1, 1);
        }
        else if((m > 0) && (n > 0))
        {
            return ack(m - 1, ack(m, n - 1));
        }else
        return n + 1;
    }

    
    
}