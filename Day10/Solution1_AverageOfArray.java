package Day10;
import java.util.*;
public class Solution1_AverageOfArray {

    public static int FindAverage(int n, int arr[]){
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
        }
        return sum/n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Average: "+FindAverage(n,arr));
    }
}
