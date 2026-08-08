package Day08;
import java.util.*;

public class Solution2_StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cmp = n;
        int sum = 0;
        if(n<=0){
            System.out.println("Not a strong number");
            return;
        }
        while(n>0){
            int mul = 1;
            int dig = n % 10;
            for (int i = 1; i <=dig; i++) {
                mul*=i;

            }
            sum+=mul;
            n/=10;

            }
        System.out.println(sum);
        if(cmp == sum){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a Strong number");
        }

    }
}
