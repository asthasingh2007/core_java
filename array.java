import java.util.*;   //start hota hai yaha
public class array{   //file k name se class banayaa haumne
public static void main(String args[]){   //main method
Scanner sc= new Scanner(System.in);   //pure code mein ham log chezein input karwa sake
int size = sc.nextInt();   //array banane se pahle declare kr do ki kitna array rahega hamara
int numbers[]=new int [size];  //numbers ko input lene k liye 

for(int i=0; i<size; i++){  //array k elements ko display karane k liye
    System.out.println(numbers[i]);
}
}
}