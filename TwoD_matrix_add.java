import java.util.Scanner;
public class TwoD_matrix_add {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the number of rows:");
    int row= sc.nextInt();
    System.out.print("enter the number of columns:");
    int columns= sc.nextInt();
    int[][] matrix_1= new int[row][columns];
    int[][] matrix_2= new int[row][columns];
System.out.println("enter the elements for matrix_1");
    for(int i=0; i<row ;i++){
        for(int j=0; j<columns ;j++){
        matrix_1[i][j]=sc.nextInt();
        }
    }
System.out.println("enter the elements for matrix_2");
    for(int i=0; i<row ;i++){
        for(int j=0; j<columns ;j++){
        matrix_2[i][j]=sc.nextInt();
        }
    }
    System.out.println("The resulting matrix after addition: ");
    for(int i=0; i<row;i++){
        for(int j=0; j<columns ; j++){

            System.out.print(matrix_1[i][j] + matrix_2[i][j]);
        }
        System.out.println();
    }
}
}
