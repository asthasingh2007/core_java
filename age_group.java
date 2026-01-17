//wap to segerate ppl of different age groups.

import java.util.Scanner;

public class age_group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");

        int n = sc.nextInt();
        if(n<=12){
            System.out.println("Child");
        }
        else if(n>12 && n<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        }
    }
}
