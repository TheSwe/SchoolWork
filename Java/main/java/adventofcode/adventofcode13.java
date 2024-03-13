package main.java.adventofcode;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
public class adventofcode13 {
    public static void main(String[] args) {

        try{
            FileReader fr = new FileReader(new File("G:\\My Drive\\TilPrrDrive\\src\\main\\java\\adventofcode\\adventofcode13.txt"));   //reads the file 
            //FileReader fr = new FileReader(new File("C:\\Users\\arvid.kagedal\\My Drive\\TilPrrDrive\\src\\main\\java\\adventofcode\\adventofcode13.txt"));   //reads the file  
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            String line; 
            String vertstr = "";
            int tot = 0;
            int id = 0;

            ArrayList<String> horizontal = new ArrayList<String>();
            ArrayList<String> vertical = new ArrayList<String>();
            while((line=br.readLine())!=null)  
            {  
                
                if(line.equals("") ){
                    for(int i = 0; i < horizontal.get(0).length(); i++){
                        for (int j = 0; j < horizontal.size(); j++){
                            vertstr = vertstr + (horizontal.get(j).charAt(i));
                        }
                        vertical.add(vertstr);
                        vertstr="";
                    }
                    //System.out.println("start");
                    System.out.println(vertical);
                    //System.out.println("end");
                    tot += findSym(vertical);
                    
                    System.out.println(horizontal);
                    tot += 100*findSym(horizontal);
                    
                    vertical.clear();
                }
                horizontal.add(line);

                if(line.equals("") ){
                    horizontal.clear();
                }
                id++;
            }    
            System.out.println(tot);
            fr.close();    //closes the stream and release the resources  
        } catch(FileNotFoundException e){
            System.out.print(e);
        } catch(IOException e){
            System.out.print(e);
        }
    }
    public static int findSym(ArrayList<String> arrList){
        /*
         * for lines start0
         * while true
         *  compare this vs this.1
         *  if this-
         *  
         */
        boolean sym = true;
        int width = 0;
        int difflines = 0;
        for(int i = 0; i<(arrList.size()-1);i++){
            //System.out.println(arrList);
            sym = true;
            while((i-width >= 0) && (i+width+1 < (arrList.size()))){
                if(arrList.get(i-width).equals(arrList.get(i+width+1))){
                    System.out.println("sym"+width);
                    //System.out.println(arrList.get(i-width));
                    //System.out.println(arrList.get(i+width+1));
                    width++;
                } else{
                    
                    System.out.println(twoLines(arrList.get(i-width),arrList.get(i+width+1)));
                    if ((twoLines(arrList.get(i-width),arrList.get(i+width+1)) == true) && (difflines == 0)){
                        difflines = 1;
                        System.out.println("symbr"+width);
                        width++;
                        sym = true;
                    } else{
                        sym = false;
                        difflines = 0;
                        System.out.println("symbreak"+width);
                        break;

                    }
                }
                
            }
            
            width = 0;
            if ((sym == true) && (difflines == 1)){
                System.out.println(i+1);
                return i+1;
            }
            difflines = 0;
        }
        return 0;
        
    }
    public static boolean twoLines(String str1, String str2){
        int chardiff = 0;
        for (int i = 0; i < str1.length(); i++) {
 
            if(str1.charAt(i) != str2.charAt(i)){
                if(chardiff == 1){
                    return false;
                }
                chardiff = 1;
            }
            
        }
        if(chardiff == 1){
            return true;
        }
        return false;
    }
}
