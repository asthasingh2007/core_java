import java.util.*;
public class divisibility_check {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your preffered number:");

        int n= sc.nextInt();
        if(n%3==0 || n%5==0){
            System.out.println("The number is divisible bby both 3 and 5");
        }
        else{
            System.out.println("condition not followed");
        }
    }
}
