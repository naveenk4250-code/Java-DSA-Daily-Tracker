package DAY_01_HCL;
import java.util.*;

public class ReplaceWithUpperCase{
    public static void ReplaceChars(StringBuilder str, char c){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c){
                char ch = str.charAt(i);
                if(Character.isLowerCase(c)){
                    ch = Character.toUpperCase(c);
                }
                else{
                    ch = Character.toLowerCase(c);
                }
                str.setCharAt(i, ch);
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        char c =sc.next().charAt(0);
        ReplaceChars(str, c);
    }
}
