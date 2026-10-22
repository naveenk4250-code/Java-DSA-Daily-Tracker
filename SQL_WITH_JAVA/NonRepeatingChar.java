package SQL_WITH_JAVA;

import java.util.Scanner;

public class NonRepeatingChar {

    public static void NonRepeat(String str){
        int freq[] = new int[25];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i)-'a'] == 1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        NonRepeat(str);
    }
}
