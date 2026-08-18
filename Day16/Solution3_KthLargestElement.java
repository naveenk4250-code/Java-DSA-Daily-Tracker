package Day16;
import java.util.*;

public class Solution3_KthLargestElement {
    public static int Element(int arr[], int n, int k){
        Arrays.sort(arr);
        System.out.println(arr[n-k]);

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Element(arr, n, k);
    }
}
