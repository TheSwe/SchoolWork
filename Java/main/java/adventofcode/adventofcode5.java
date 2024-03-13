package main.java.adventofcode;

import java.util.ArrayList;
import java.io.*;
import java.util.Arrays;
import Math.min;
import java.util.Collections;

public class adventofcode5 {
    public static void main(String[] args) {
        try{
            
            long[] seeds = {91926764L, 3279509610L, 2781720183L, 1315129829L, 3995609239L, 358337926L, 1543999077L, 1795811745L, 2616560939L, 869828854L};
            int[] seedrange = {235794528, 325625103, 218217413, 102999617, 143268116, 185836835, 241888600, 806228439, 56204204, 224520829};
            //long[] seeds = {56204204};
            
            //double[] seeds = {79.0, 14.0, 55.0, 13.0};
            String line; 
            ArrayList<long[]> lines = new ArrayList<>();
            long tot = 0;
            int id = 0;
            long num = seeds[0];

            
            
            for (int i = 0; i < seeds.length; i++) {
                /*long[] numArr = new long[];
                for (int j = 0; j < seedrange[i]; j++){
                    numArr[j] = seeds[i] + j;
                }*/

                //FileReader fr = new FileReader(new File("C:\\Users\\arvid.kagedal\\My Drive\\TilPrrDrive\\src\\main\\java\\adventofcode\\adventofcode5.txt"));   //reads the file  
                //FileReader fr = new FileReader(new File("C:\\Users\\arvid.kagedal\\My Drive\\TilPrrDrive\\src\\main\\java\\adventofcode\\adventofcode5test.txt"));   //reads the file  
                FileReader fr = new FileReader(new File("G:\\My Drive\\TilPrrDrive\\src\\main\\java\\adventofcode\\adventofcode5.txt"));   //reads the file 
                //FileReader fr = new FileReader(new File("G:\\My Drive\\TilPrrDrive\\src\\main\\java\\adventofcode\\adventofcode5test.txt"));   //reads the file 
                BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream 
                id = 0;
                System.out.println(i);
                System.out.println(seeds[i]);
                num = seeds[i];
                while((line=br.readLine())!=null)  
                {  
                    id++;
                    if(line.equals("") ){
                        for (int j = 0; j < numArr.length; j++){
                            numArr[j] = calcLines(lines, numArr[j]);
                        }
                        
                        
                        lines.clear();

                        System.out.println("found");
                        System.out.println(id);
                        //System.out.println(num);
                    } else{
                    try {
                        lines.add(lineConvert(line));

                    } catch (Exception e) {
                        System.out.println(e);
                    }}
                }    

                
                num = minNum(numArr);
                System.out.println("    final"+num);

                Arrays.fill(numArr, 0);
                fr.close();    //closes the stream and release the resources  
        }
            
        } catch(FileNotFoundException e){
            System.out.print(e);
        } catch(IOException e){
            System.out.print(e);
        }
    
    }
    public static long calcLines(ArrayList<long[]> lines, long input) {
        long[] line;
        for (int i = 0; i < lines.size(); i++){
            line = lines.get(i);
            if (input <= (line[1] + line[2]) && input >= line[1]){
                /*System.out.print(line[0]);
                System.out.print(" "+line[1]);
                System.out.print(" "+line[2]);
                System.out.println(" "+(line[0] - line[1]));
                System.out.println("jf"+input);*/
                //printAr(line);
                //System.out.println(i);
                return input + (line[0] - line[1]);
            }
            
        }
        //System.out.println("fj"+input);
        return input;
    }

    public static long[] lineConvert(String line) {
        try{
            String[] lineArr = line.split("\s");
            //System.out.println(Arrays.toString(lineArr));
            long[] longArr = new long[lineArr.length];
            for (int i = 0; i < lineArr.length; i++){
                longArr[i] = Long.parseLong(lineArr[i]);
            }
            //printAr(longArr);
            //printAr(lineArr);
            //System.out.println("end end");
            
            return longArr;
        } catch (Exception e){
            //System.out.println(e);
            long[] empty = {0,0,0};
            return empty;
        }
        
    }
    public static void printAr(long[] ar){
        //loops through the array and prints all the values
        System.out.println();
        for (int i = 0; i < ar.length; i++){
            
            System.out.print(ar[i]+ " ");
            
        }
        System.out.println("end");
    }
    public static void printAr(String[] ar){
        //loops through the array and prints all the values
        System.out.println();
        for (int i = 0; i < ar.length; i++){
            
            System.out.print(ar[i]+ " ");
            
        }
        System.out.println("end");
    }
    public static long minNum(long[] nums){
        long min = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < min && nums[i] != 0){
                min = nums[i];
            }
        }
        return min;
    }
}
