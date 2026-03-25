import java.util.Scanner;
public class push_pop {
    static int stack[]=new int[5];
    static int Top = -1;

    // PUSH Operation
    static void Push(int value){
        if(Top==stack.length -1){
            System.out.println("Stack overflow!! cannot be added further." +value);
        }
        else{
            Top++;
            stack[Top]=value;
            System.out.println(value+ "pushed into the stack");
        }
    }
    //POP Operations
    static void POP(){
        if(Top==-1){
            System.out.println("The stack in underflowed!! cannot POP further!");
        }
        else{
            System.out.print(stack[Top]+ "removed from stack");
            Top--;
        }
    }
    // Display Operator
    static void display(){
        if(Top==-1){
            System.out.println("stack is empty!!");
        }
        else{
            System.out.println("stack elements are: ");
            for(int i=Top; i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int choice,value;
            do{
                System.out.println("/n ---STACK MENU---");
                System.out.println("1. PUSH");
                System.out.println("2. POP");
                System.out.println("3. DISPLAY");
                System.out.println("4. EXIT...");
                System.out.println("Enter your choice: ");
                choice= sc.nextInt();
        switch ( choice){
            case 1:
                    System.out.println("enter the value to push");
                    value=sc.nextInt();
                    Push(value);
                    break;
            case 2:
                     POP();
                     break;
            case 3:
                    display();
                    break;
            case 4:
                     System.out.println("Exiting Program....");
                     break;
            default: 
                    System.out.println("Invalid choice!! Try Again!!!");
        }   
    }
     while(choice !=4);
    sc.close();
}
}