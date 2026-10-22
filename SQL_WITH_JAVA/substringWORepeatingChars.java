package SQL_WITH_JAVA;
import java.util.*;


public class substringWORepeatingChars {

    public static void longest(String str){
        int st = 0, end = 0, max_length = 0;
        List<Character> l = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(!l.contains(str.charAt(i))){
                l.add(str.charAt(i));
                end++;
                max_length = Math.max(max_length, l.size());
            }else{
                l.remove(Character.valueOf(str.charAt(st)));
                st++;
            }
        }
        System.out.println(max_length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        longest(str);
    }
}
