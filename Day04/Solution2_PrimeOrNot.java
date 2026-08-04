package Day04;
import java.util.*;
public class Solution2_PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        if(n<2){
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i <n ; i++) {
            if(n % i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
