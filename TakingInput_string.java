import java.util.Scanner;

public class TakingInput_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter your name:");
        String name = sc.next();
        System.out.println("your name is: "+name);
    }
}
