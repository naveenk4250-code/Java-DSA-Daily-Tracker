package Day12;
import java.util.*;

public class Solution3_LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int st = 0;
        int end = 0;
        int max = 0;
        List<Character> list = new ArrayList<>();


        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max = Math.max(max, list.size());
            }
            else {
                list.remove(Character.valueOf(s.charAt(st)));
                st++;
            }
        }
        System.out.println("MAX_LENGTH: "+max);
    }
}
