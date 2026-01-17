import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
    
        System.out.println(" enter principle amount: ");
        float p = sc.nextFloat();

        System.out.println("enter the rate of interest: ");
        float r = sc.nextFloat();

        System.out.println("enter the time: ");
        float t = sc.nextFloat();

        float Simple_Interest = (p*r*t/100);

        System.out.println("principle: "+p);
        System.out.print("Rate of interest: "+r);
        System.out.println("Time: ");
        System.out.println("The simple interest is: "+Simple_Interest);
    } 
}
