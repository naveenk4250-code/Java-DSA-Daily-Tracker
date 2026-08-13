package Day13;
import java.util.*;


public class Solution4_MaxConsecutiveOnes {

    public static int CountOnes(int arr[], int n){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                sum+=1;
            }else{
                sum = 0;
            }
            count = Math.max(count, sum);
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        CountOnes(arr, n);
    }
}
