package Day12;
import java.util.*;

public class Solution5_PalindromeNumber {
    public static int CheckPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n>0){
            int dig = n % 10;
            rev = rev*10+dig;
            n/=10;
        }
        if(original == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CheckPalindrome(n);

    }
}
