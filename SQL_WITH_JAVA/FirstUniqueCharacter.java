package SQL_WITH_JAVA;
import java.util.*;

public class FirstUniqueCharacter {

    public static void UniqueCharacter(String str){
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i)-'a']!= 1){
                continue;
            }else{
                System.out.println(str.charAt(i));
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        UniqueCharacter(str);
    }
}
