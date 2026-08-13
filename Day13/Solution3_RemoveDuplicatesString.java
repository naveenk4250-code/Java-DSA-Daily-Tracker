package Day13;
import java.util.*;


public class Solution3_RemoveDuplicatesString {
    public static String RemoveDuplicates(String str){
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!hs.contains(str.charAt(i))){
                hs.add(str.charAt(i));
            }
        }
//        System.out.println(hs.toString());

        StringBuffer sb = new StringBuffer();
        for(char ch:hs){
            sb.append(ch);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        RemoveDuplicates(str);

    }
}
