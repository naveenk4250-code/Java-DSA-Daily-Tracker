package DAY_01_HCL;
import java.util.*;

public class ReverseWordsInSentence {
    public static void ReverseSentence(String str){
        String words[] = str.split(" ");
        for (int i = words.length-1; i >=0 ; i--) {
            System.out.print(words[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ReverseSentence(str);
    }
}
