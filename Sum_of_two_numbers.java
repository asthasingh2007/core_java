import java.util.Scanner;
public class Sum_of_two_numbers {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    
    System.out.println("enter first number: a");
    int a = sc.nextInt();
    System.out.println("enter second number: b");
     int b = sc.nextInt();
    int sum= a+b;
    System.out.println("The sum of two number is: "+sum);

    }
}
