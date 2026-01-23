//WAP java program to find the sum of the digits.
import java.util.*;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sumOFdigit=0;
        int original =n;
    while(n>0){
        sumOFdigit +=n%10;
        n= n/10;
    }
    System.out.println("number of digits in " +original+ " is " +sumOFdigit);
    }
}
