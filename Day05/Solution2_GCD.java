package Day05;
import java.util.*;

public class Solution2_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        int mini = Math.min(a,b);
        for (int i = 2; i<=mini; i++) {
            if(a % i ==0 && b % i == 0){
                gcd = i;

            }
        }
        System.out.println(gcd);
    }
}
