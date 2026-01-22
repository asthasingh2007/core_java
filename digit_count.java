// WAP in java to show the cout of digits entered.
import java.util.*;
public class digit_count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("enter your number");
         int n= sc.nextInt();
        int num_of_digits=0;
        int original_n=n;
        while(n>0){
            n=n/10;
            num_of_digits++;
        }
        System.out.println("The number of digits in "+ original_n +" is " + num_of_digits);
    }
}
