package Day04;
import java.util.*;
public class Solution3_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        if(n == 0 || n == 1){
            System.out.println("1");
            return;
        }
        for (int i = 1; i <=n ; i++) {
            ans*=i;
        }
        System.out.println(ans);
    }
}
