//WAP to find out the number is even or odd using logical operator.
import java.util.*;
public class evenOdd_logical {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n= sc.nextInt();
        String ans;
        ans= (n%2==0) ? "even" : "odd";
        System.out.println(ans);
    }
}
