package Day11;
import java.util.*;

public class Solution5_ToggleCase {
    public static String Toggle(String str){
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i <=str.length()-1; i++) {
                Character c = str.charAt(i);
                if(Character.isLowerCase(c)){
                    str2.append(Character.toUpperCase(c));
                }else{
                    str2.append(Character.toLowerCase(c));
                }
        }
        return str2.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Toggled String: "+Toggle(str));
    }
}
