package Uppgifter;

public class arrayUppgift {
    public static void main(String[] args){
        //Uppgift 1
        //Creates a1 with values
        int [] a1 = {1,3, 5,7};
        //Creates a2 without values
        int [] a2 = new int [4];
        //Assigns values to a2
        for (int i = 1; i <= a2.length; i++){
            //Assigns value 2*i to index i-1
            a2[i-1] = 2*i;
        }
        //calls function arraySum on both arrays
        int a1Sum = arraySum(a1);
        int a2Sum = arraySum(a2);
        //Prints the difference between a2sum and a1sum
        System.out.println(a2Sum - a1Sum);

        //Uppgift 2with defined values
        //creates A with nested arrays 
        int [][] A = {{1,2},{3,4}};
        //creates B, a nested array without values
        int [][] B = new int [2][2];
        //for loop that loops into the inner array and assigns values 
        for (int i = 0; i < 2; i++){
            for(int j = 0; j <2; j++){
                B[i][j] = i+j;
            }
        }
        //Prints arrays
        printMatrix(A);
        printMatrix(B);
        //Uppgift 3
        //creates nested array withhout values
        int [][] C = new int[2][2];
        //adds the matrixes A and B and assigns the result to C
        C = addMatrix(A, B);
        //prints array
        printMatrix(C);
        //Uppgift 4
        //creates empty array and multiplies A and B and assigns those values to D, then prints D
        int [][] D = new int[2][2];
        D = multMatrix(A, B);
        printMatrix(D);
        
    }
    public static int arraySum(int[] ar){
        int sum = 0;
        //loops through the array and adds all the values
        for (int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        //returns the sum of all the values in the array
        return sum;
    }
    public static void printAr(int[] ar){
        //loops through the array and prints all the values
        for (int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }
    public static void printMatrix(int[][] ar1){
        //loops through both layers of the array and prints the values in a square
        for (int i = 0; i < 2; i++){
            for(int j = 0; j <2; j++){
                System.out.print(ar1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[][] addMatrix(int[][] ar1, int[][] ar2){
        //loops through two two-dimensional arrays and adds the values, returns an array containing the results
        int [][] addedArr = new int [2][2];
        int it;
        for (int i = 0; i < 2; i++){
            for(int j = 0; j <2; j++){
                //gets the values of the same positioni in the array, adds them together and puts the result in another array
                it = ar1[i][j]+ar2[i][j];
                addedArr[i][j] = it;
            }
        }
        return addedArr;
    }
    public static int[][] multMatrix(int[][] ar1, int[][] ar2){
        //Multiplies two two-dimensional arrays of length two and returns an array containing the results
        int [][] multiedArr = new int [2][2];
        int a;
        int b;
        //multiplies the same position in ar1s column and ar2s row and then sums both the products of the two indices
        for (int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                a = ar1[i][0] * ar2[0][j];
                b = ar1[i][1] * ar2[1][j];
                multiedArr[i][j] = a+b;
            }
        }
        return multiedArr;
    }
}