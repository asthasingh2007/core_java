import java.util.*;   //start hota hai yaha
public class array_1 {  //file k name se class banayaa haumne
public static void main(String args[]){   //main method
Scanner sc= new Scanner(System.in);   //pure code mein ham log chezein input karwa sake
int size = sc.nextInt();   //array banane se pahle declare kr do ki kitna array rahega hamara
int numbers[]=new int [size];  //numbers ko input lene k liye 
  
//input

for(int i=0; i<size; i++){   //ye loop isiliye hai kyuki ham numbers of i ko leke input kara rahe honge ek ek element and loop har ek element tak chale isiliye loop laga hai
    numbers[i]= sc.nextInt();
}

//output

for(int i=0; i<size; i++){  //array k elements ko display karane k liye
    System.out.println(numbers[i]);
}
}
}

