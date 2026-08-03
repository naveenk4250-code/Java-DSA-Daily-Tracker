package Practice_chinna;
import java.util.*;
public class Solution2_PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        while(m>0){
            int dig = m % 10;
            rev = rev*10+dig;
            m = m/10;
        }
        if(rev == n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
