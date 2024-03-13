package main.java.adventofcode;
import java.util.Scanner;
import java.io.*;
public class adventofcode2 {
    public static void main(String[] args) {
        int red = 0;
        int green = 0;
        int blue = 0;
        int tot = 0;
        int id = 0;
        int number;
        String nonint = "";
        boolean dontadd = false;
        try{
        FileReader fr = new FileReader(new File("G:\\My Drive\\TilPrrDrive\\src\\main\\java\\adventofcode\\adventofcode2.txt"));   //reads the file  
        BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
        String line; 
        
        
        while((line=br.readLine())!=null)  
        {  
            id++;
            red = 0;
            green = 0;
            blue = 0;

            System.out.println(id);
            if(id<11){
                line=line.substring(8);
            } else if(id<100){
                line=line.substring(9);
            } else{
                line=line.substring(10);
            }
            System.out.println(line);
  
            // create a new scanner 
            // with the specified String Object 
            Scanner scanner = new Scanner(line); 
    
            while (scanner.hasNext()) { 
    
                // if the next is a Int, 
                // print found and the Int 
                
                number = scanner.nextInt(); 
                nonint = scanner.next(); 
                nonint.stripTrailing();
                
                nonint = nonint.replace(",", "");
                nonint = nonint.replace(";", "");

                if (nonint.equals("red") && red < number){
                    System.out.print(number+ "  ");
                    red = number;
                } else if (nonint.equals("green") &&  green <number ){
                    System.out.print(number);
                    green = number;
                } else if (nonint.equals("blue") && number > blue){
                    System.out.print(number);
                    blue = number;
                }
            } 
            System.out.println(blue*red*green);
            tot = tot + blue*red*green;
            
        }  
        fr.close();    //closes the stream and release the resources  
        } catch(Exception e){
            System.out.print(e);
        }
        System.out.println(tot);
        
    }
 
}
