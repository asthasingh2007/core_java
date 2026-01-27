import java.util.*;
public class equilateral_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int a=sc.nextInt();
        for(int i=1; i<=a ;i++){
            for(int j =1; j<=a-i;j++){
                System.out.print(" ");
            }
                 for(int s=1;s<=2*i-1; s++){
                System.out.print("*");
            
            }
            System.out.println();
        }
    }
}
