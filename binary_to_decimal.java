import java.util.*;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the binary digits:");
        int binary_num= sc.nextInt();

        int ans =0; //converted decimal number.
        int b=1; // 2^0 = 1 power of 2.
        while(binary_num>0){
            int unit_digit= binary_num %10;
            ans += (unit_digit*b);
            binary_num/=10;
            b*=2;
        }
        System.out.println(ans);
    }
}
