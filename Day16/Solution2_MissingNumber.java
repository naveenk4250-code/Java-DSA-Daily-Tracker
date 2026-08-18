package Day16;
import java.util.*;

public class Solution2_MissingNumber {
    public static int MissingNum(int arr[], int n){
        int sum = 0;
        for (int i = 0; i < n-1  ; i++) {
            sum+=arr[i];
        }
        int ActualSum = n*(n+1)/2;
        int missing = ActualSum - sum;
        System.out.println(missing);
        return missing;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        MissingNum(arr, n);
    }
}
