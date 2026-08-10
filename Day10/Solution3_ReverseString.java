package Day10;
import java.util.*;
public class Solution3_ReverseString {
    public String reverse(String str){
        String str2="";
        for (int i = str.length()-1; i >=0 ; i--) {
            str2+=str.charAt(i);
        }

        return str2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution3_ReverseString s = new Solution3_ReverseString();
        System.out.println("Reversed: "+s.reverse(str));
    }
}
