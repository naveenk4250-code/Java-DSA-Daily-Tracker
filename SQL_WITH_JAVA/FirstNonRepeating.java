package SQL_WITH_JAVA;
import java.util.*;

public class FirstNonRepeating {
    public static void FindNR(int arr[], int n){
        int freq[] = new int[9];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if(freq[arr[i]] == 1){
                System.out.println("Found: "+arr[i]);
                return;
            }
        }System.out.println("-1");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        FindNR(arr, n);
    }
}
