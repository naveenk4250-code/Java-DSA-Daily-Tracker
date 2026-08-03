package Practice_chinna;
import java.util.*;

public class Solution3_CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0, even = 0;

        while(n>0){
            int dig = n % 10;
            if(dig%2 == 0){
                even++;
            }else{
                odd++;
            }
            n = n/10;
        }
        System.out.print(even+" ");
        System.out.print(odd);
    }
}
