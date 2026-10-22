package SQL_WITH_JAVA;

import java.util.*;

public class RotateArrayByKPos {

    public static void Rotate(int arr[], int st, int end){
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] =  temp;
            st++;end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(k<n && k>0) {
            Rotate(arr, 0, n - 1);
            Rotate(arr, 0, k - 1);
            Rotate(arr, k, n - 1);
        }else{
            System.out.println("Rotation can't be done");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
