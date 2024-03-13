package main.java.adventofcode;
import java.util.Scanner;
import java.io.*;

public class adventofcode1 {
    public static void main(String[] args) { 
        try  
        {  
        FileReader fr = new FileReader(new File("C:\\Users\\arvid.kagedal\\My Drive\\TilPrrDrive\\src\\main\\java\\adventofcode\\adventofcode1.txt"));   //reads the file  
        BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
        
        
        String line;  
        //line = "jmgnfive7ffglffpjlvbtvl935zz";
        int num;
        String char0;
        String char1;
        int total = 0;
        int index;
        int amount;
        while((line=br.readLine())!=null)  
        {  
            //System.out.println(line);
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
        fr.close();    //closes the stream and release the resources  
        System.out.println(total);
        } catch(Exception e){
            System.out.print(e);
        }
        
        
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
