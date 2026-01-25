import java.util.*;
public class raise_power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        System.out.println("Enter the value of b:");
        int a=sc.nextInt(),n= sc.nextInt();
        
        int fact=1;
        for(int i=1; i<=n ;i++){
            fact*= a;
        }
        System.out.println();
    }
}
