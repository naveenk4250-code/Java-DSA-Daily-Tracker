package Day07;
import java.util.*;
public class Solution6_ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Java is fun";
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            for(int j = words[i].length()-1; j>=0;j--){
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}