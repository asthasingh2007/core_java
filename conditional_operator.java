import java.util.*;
public class conditional_operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your preffed number");

        int n = sc.nextInt();
        if(n%2==0 && n%3==0){
            System.out.println("The numver is even and is divisible by three");
        }
        else{
            System.out.println("condition not followed");
        }
    }
}
