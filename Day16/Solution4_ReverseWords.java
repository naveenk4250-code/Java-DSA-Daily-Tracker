package Day16;
import java.util.*;

public class Solution4_ReverseWords {
    public static String Reverse(String str){
        String words[] = str.split(" ");
        for (int i = words.length-1; i >=0  ; i--) {
            System.out.print(words[i]+" ");
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Reverse(str);
    }
}
