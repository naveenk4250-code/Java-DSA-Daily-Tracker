package Day12;
import java.util.*;

public class Solution4_MaximumSubArray {
    public static int SumSubArray(int n,int arr[], int k){
        int max = 0;
        for (int i = 0; i < n-k; i++) {
            int sum = 0;
            for(int j = i;j<k+i;j++){
                sum+=arr[j];
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        SumSubArray(n,arr,k);
    }
}
