package Day15;
import java.util.*;

public class Solution2_MoveZerosToEnd {
    public static int[] moveZeros(int arr[], int n){

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }

        while(count < n){
            arr[count] = 0;
            count++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeros(arr, n);
    }
}
