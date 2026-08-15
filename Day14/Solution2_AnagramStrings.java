package Day14;
import java.util.*;

public class Solution2_AnagramStrings {
    public static void Anagrams(String str1, String str2){
        int n1 = str1.length();
        int n2 = str2.length();
        int freq[] = new int[26];

        if(n1!=n2){
            System.out.println("Not Anagrams");
            return;
        }
        for (int i = 0; i < n1; i++) {
            freq[str1.charAt(i)-'a']++;
        }
        for (int i = 0; i < n2; i++) {
            freq[str2.charAt(i)-'a']--;
        }

        boolean isAnagram = true;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] >0){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Anagrams(str1,str2);
    }
}
