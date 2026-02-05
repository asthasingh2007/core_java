public class Matrixddition {
    public static void main(String[] args) {
        
        int a[][]={{3,7},{9,4}};
        int b[][]={{1,6},{7,8}};
        // int sum [][] = new int[2][2]
        for (int i=0; i<2 ; i++){
            for(int j=0; j<2 ; j++){
                a[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("sum of matrix: ");
        for(int i=0 ; i<2 ; i++){
            System.out.println(a[i][j] + " ");

        }
    }
}
