import java.util.*;
public class search_index {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int size= sc.nextInt();
    int numbers[]=new int[size];
    //input
    System.out.println("enter the elements of array");
    for(int i=0 ; i<size ; i++){
        numbers[i]= sc.nextInt();
    }
    System.out.println("enter the number that you want to find");
    int x= sc.nextInt(); //ye wo number hai jisko we have to find

    //output
    for(int i=0; i<numbers.length; i++){
        if(numbers[i]==x){
    System.out.println("x found at index: " +i);
    }
   } 
}
}
