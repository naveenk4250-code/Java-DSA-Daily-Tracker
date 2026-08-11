package Day11;
import java.util.*;
public class Solution2_ArmStrongNumber {
    public static int ArmStrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int dig= n % 10;
            sum+=Math.pow(dig,3);
            n/=10;
        }
        if(sum == original){
            System.out.println("ArmStrong Number");
        }else{
            System.out.println("Not an ArmStrong");
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArmStrong(n);
    }
}
