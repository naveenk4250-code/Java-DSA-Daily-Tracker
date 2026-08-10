package Day10;
import java.util.*;
public class Solution7_MissingNumber {
    public static int FindMissing(int n, int arr[]){
        int sum = 0;
        int ArrSum = 0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        for (int i = 0; i < arr.length; i++) {
            ArrSum+=arr[i];
        }
        int missing = sum-ArrSum;
        return missing;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        for (int i = 0; i <n-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing Value: "+FindMissing(n,arr));
    }
}
