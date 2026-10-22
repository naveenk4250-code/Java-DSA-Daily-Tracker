package SQL_WITH_JAVA;
import java.net.SocketOption;
import java.util.*;

public class PalindromeORnot {

    public static void check(String str){
        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        if(reversed.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        check(str);
    }
}
