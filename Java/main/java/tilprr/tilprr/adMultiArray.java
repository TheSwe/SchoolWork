package tilprr.tilprr;

public class adMultiArray {
    public static void main(String[] args) {
        int [][] ar1 = {{1,2,3},{3,4}};
        int [][] ar2 = {{5,6},{7,8,3,3},{4,5,6}};
        addMatrix(ar1, ar2);
    }
    public static int[][] addMatrix(int[][] ar1, int[][] ar2){
        int ar1length = ar1.length;
        int ar2length = ar2.length;
        //int maxarrLength = ar1length > ar2length ? ar1length : ar2length;
        int [] ar1lengths = new int[ar1length];
        int [] ar2lengths = new int[ar2length];
        int maxinternalarrLength = 0;
        for (int i = 0; i < ar1length; i++) {
            ar1lengths[i] = ar1[i].length;
            maxinternalarrLength = maxinternalarrLength < ar1[i].length ? ar1[i].length : maxinternalarrLength;
        }
        for (int i = 0; i < ar2length; i++) {
            ar2lengths[i] = ar2[i].length;
            maxinternalarrLength = maxinternalarrLength < ar2[i].length ? ar2[i].length : maxinternalarrLength;
        }
        //int [][] finalAr = new int[maxarrLength][maxinternalarrLength];
        
        System.out.println(ar1length);
        System.out.println(ar2length);
        printAr(ar1lengths);
        printAr(ar2lengths);

        return new int[1][1];
        
        /*int length = ar1length>ar2length ? ar1length :  ar2length;
        for (int i=0; i<ar1length; i++){

        }

        int [][] addedArr = new int [length][2];
        int it;
        for (int i = 0; i < 2; i++){
            for(int j = 0; j <2; j++){
                it = ar1[i][j]+ar2[i][j];
                addedArr[i][j] = it;
            }
        }
        return addedArr; */
    }
    public static void printMatrix(int[][] ar1){
        for (int i = 0; i < 2; i++){
            for(int j = 0; j <2; j++){
                System.out.println(ar1[i][j]);
            }
        }
    }
    public static void printAr(int[] ar){
        for (int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }
}
