package Day03;
import java.util.*;
public class Solution3_ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arm = n;
        double same = 0;
        while(arm>0){
            double dig = arm % 10;
            same += Math.pow(dig,3.0);
            arm/=10;
        }
        if(same == n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not a Armstrong");
        }
    }
}
