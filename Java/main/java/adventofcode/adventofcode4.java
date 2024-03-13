package main.java.adventofcode;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class adventofcode4 {

    public static void main(String[] args) {
        int id = 0;
        int medtot = 0;
        double tot = 0;
        int[] win = new int[10];
        int[] nums = new int[25];
        int[] cardcounts = new int[213];
        int[] medtots = new int[213];
        Arrays.fill(cardcounts, 1);
        
        try{
            FileReader fr = new FileReader(new File("G:\\My Drive\\TilPrrDrive\\src\\main\\java\\adventofcode\\adventofcode4.txt"));   //reads the file  
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            String line; 
            
            
            while((line=br.readLine())!=null)  
            {  
                medtot = 0;
                Scanner scanner = new Scanner(line);
                line=line.substring(10);
                System.out.println(line);
                scanner.next();
                scanner.next();
                for (int i = 0; i<10;i++){
                    
                    win[i] = scanner.nextInt(); 
                }
                scanner.next();
                for (int i = 0; i<25;i++){
                    nums[i] = scanner.nextInt(); 
                }
                System.out.println(Arrays.toString(nums));
                System.out.println(Arrays.toString(win));
                for (int i = 0; i<25;i++){
                    for (int j = 0; j<10;j++){
                        if (nums[i] == win[j]){
                            medtot ++;
                        }
                    } 
                }
                System.out.println(medtot);
                medtots[id] = medtot;
                for (int k = 1; k<=medtot;k++){
                    cardcounts[id+k] = cardcounts[id+k] + cardcounts[id];
                }
                id++;
            }  
            System.out.println(Arrays.toString(cardcounts));
            System.out.println(Arrays.toString(medtots));
            for (int i = 0;i<213;i++){
                tot = tot + cardcounts[i];
            }
            fr.close();    //closes the stream and release the resources  
        } catch(Exception e){
            System.out.print(e);
        }
        System.out.println(tot);
    }

    
}
