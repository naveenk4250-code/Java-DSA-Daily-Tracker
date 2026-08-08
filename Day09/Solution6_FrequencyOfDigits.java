package Day09;
import java.util.*;
public class Solution6_FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[10];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i <freq.length; i++) {
            if(freq[i]>0){
                System.out.println(i+" -> "+freq[i]);
            }
        }
    }
}