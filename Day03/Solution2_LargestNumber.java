package Day03;
import java.util.*;
public class Solution2_LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        while(n>0){
            int dig = n % 10;
            if(dig>max){
                max = dig;
            }
            n/=10;
        }
        System.out.println(max);
    }
}
