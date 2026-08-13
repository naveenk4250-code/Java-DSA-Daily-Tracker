package Day13;
import java.util.*;

public class Solution2_SecondLargest {
    public static int SecondLargestElement(int arr[], int n){
        int l = 0;
        int sl = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>l){
                sl = l;
                l = arr[i];
            }else if(arr[i]>sl && arr[i]!=l){
                sl = arr[i];
            }

        }
        System.out.print(sl);
        return sl;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SecondLargestElement(arr,n);
    }
}
