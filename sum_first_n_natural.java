import java.util.*;
public class sum_first_n_natural {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your preffered number");
        int n = sc.nextInt();
        int sum=0;
        int num=1;
    while(num<=n){
        sum=sum+num;
        num++;
    }
     System.out.println(sum);
    }
}
