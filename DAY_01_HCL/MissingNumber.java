package DAY_01_HCL;
import java.util.*;

public class MissingNumber {
    public static void missing(int arr[], int n){
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1+=i;
        }
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        int missing = sum1-sum2;
        System.out.println("Missing: "+missing);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        missing(arr,n);
    }
}
