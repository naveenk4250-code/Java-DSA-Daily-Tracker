package Day09;
import java.util.*;

public class Solution7_RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,5,5};
        int unique[] = removeDuplicates(arr);
        System.out.println(Arrays.toString(unique));
    }
    public static int[] removeDuplicates(int arr[]){
        Set<Integer>set = new HashSet<>();
        for(int num :arr){
            set.add(num);
        }
        int result[] = new int[set.size()];
        int idx = 0;
        for(int num:set){
            result[idx++] = num;
        }
        return result;
    }
}