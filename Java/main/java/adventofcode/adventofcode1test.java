package main.java.adventofcode;
public class adventofcode1test {
    public static void main(String[] args) {
        
        String line = "sixfconesix6three1sixsix";
        int num;
        String char0;
        String char1;
        int total = 0;
        int index;
        int amount = 0;
        String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};

            for (int i = 0; i < numbers.length; i++){
                amount = countFreq( numbers[i], line);

                for (int j = 0; j < amount; j++){
                    index = line.lastIndexOf(numbers[i])+1;
                    System.out.print(index);
                    line = line.substring(0, index) + i 
                    + line.substring(index + 1); 
                    System.out.println(j);
                    
                    
                }
            }
            System.out.println(line);

            line = line.replaceAll("[^\\d.]", "");      //appends line to string buffer  
            //System.out.println(line);
            char0 = String.valueOf(line.charAt(0));
            char1 = String.valueOf(line.charAt(line.length()-1));
            //System.out.println(char0 +char1);
            //System.out.println(char0);
            num = Integer.valueOf(char0+char1);
            System.out.println(num);
            total = total+num;
            
            
    }
    static int countFreq(String pat, String txt)
    {
        int M = pat.length();
        int N = txt.length();
        int res = 0;
 
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            /* For current index i, check for
        pattern match */
            int j;
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
 
            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            if (j == M) {
                res++;
                j = 0;
            }
        }
        return res;
    }
}
