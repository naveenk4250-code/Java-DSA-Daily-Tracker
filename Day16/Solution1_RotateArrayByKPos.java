package Day16;
import java.util.*;

public class Solution1_RotateArrayByKPos {
    public static void Rotate(int arr[], int st, int end){

        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        pos = pos%n;
        Rotate(arr, 0,n-1);
        Rotate(arr,0,pos-1);
        Rotate(arr,pos,n-1);


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
