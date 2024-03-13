package KattisPackage;
import java.util.Scanner;
public class height {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amount = scan.nextInt();
        int[] heights = new int[20];
        int swaps;
        int temp;
        for (int i = 0; i < amount; i++) {
            swaps = 0;
            int arraynum = scan.nextInt();
        
            for (int j = 0; j < 20; j++){
                heights[j] = scan.nextInt();
            }
            for (int j = 0; j < 20; j++){
                for (int k = 0; k < 20-j-1; k++){
                    if (heights[k]> heights[k+1]){
                        temp = heights[k];
                        heights[k] = heights[k+1];
                        heights[k+1] = temp;
                        swaps++;
                    }

                }
            }
            System.out.print(arraynum+" ");
            System.out.println(swaps);
        }
        scan.close();
    }
}
