package Day11;
import java.util.*;
public class Solution6_FirstNonRepeatinCh {
    public static void FirstChar(String str){
        int arr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if(arr[str.charAt(i)-'a'] == 1){
                System.out.println((str.charAt(i)));
                break;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        FirstChar(str);
    }
}
