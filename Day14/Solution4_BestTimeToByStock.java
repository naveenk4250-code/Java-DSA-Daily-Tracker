package Day14;
import java.util.*;

public class Solution4_BestTimeToByStock {
    public static void BestTime(int n, int arr[]){
        int minPrice = arr[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            if(arr[i]<minPrice){
                minPrice = arr[i];

            }else{
                int profit = arr[i] - minPrice;
                if(profit>max){
                    max = profit;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BestTime(n,arr);
    }
}
