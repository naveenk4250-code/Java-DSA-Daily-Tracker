package Day15;
import java.util.*;

public class Solution1_ProductExceptSelf {
    public static int[] Product(int arr[], int n){
        int res[] = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i-1]*arr[i-1];
        }

        int rightProduct = 1;
        for (int r = n-1; r >= 0 ; r--) {
            res[r] = res[r]*rightProduct;
            rightProduct *= arr[r];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+" ");
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Product(arr,n);
    }
}
