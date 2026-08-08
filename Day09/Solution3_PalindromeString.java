package Day09;
import java.util.*;

public class Solution3_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2="";
        for (int i = s1.length()-1; i >= 0; i--) {
            s2+=s1.charAt(i);
        }
        System.out.println(s2);
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}