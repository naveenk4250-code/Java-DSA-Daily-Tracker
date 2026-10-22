package DAY_01_HCL;
import java.util.*;

public class TwoSum {
    public static void  TWOSUM(int arr[], int target){
        int st = 0, end = arr.length-1;
        while(st<end){
            int sum = arr[st]+arr[end];
            if(sum == target){
                System.out.println(st+" "+end);
                break;
            }else if(sum<target){
                st++;
            }else{
                end--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        TWOSUM(arr, target);
    }
}
