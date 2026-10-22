package Day18;
import java.util.*;

public class Solution1_RemoveDupFromSortedArray {

    public static int RemoveDuplicate(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        for(int i: hs){
            System.out.print(i+" ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        RemoveDuplicate(arr);
    }
}
