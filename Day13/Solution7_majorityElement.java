package Day13;
import java.util.*;

public class Solution7_majorityElement {
    public static int Majority(int arr[], int n){
        int freq[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>n/2){
                System.out.println(i);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Majority(arr,n);
    }
}
