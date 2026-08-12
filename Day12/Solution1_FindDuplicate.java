package Day12;
import java.util.*;

public class Solution1_FindDuplicate {
    public static int FindDuplicate(int arr[], int n){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(hs.contains(arr[i])){
                System.out.println("Duplicate: "+arr[i]);
            }
            hs.add(arr[i]);
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
        FindDuplicate(arr,n);
    }
}
