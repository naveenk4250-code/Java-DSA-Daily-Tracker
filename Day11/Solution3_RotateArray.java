package Day11;
import java.util.*;

public class Solution3_RotateArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int l = 0;
//        int r = n-1;
//        while(l<r){
//            int temp = arr[l];
//            arr[l] = arr[r];
//            arr[r] = temp;
//            l++;
//            r--;
//        }
//        System.out.println("reversed: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }

    public static int RotateArray(int arr[]){
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        int l2 = 1;
        int r2 = arr.length-1;
        while(l2<r2){
            int temp = arr[l2];
            arr[l2] = arr[r2];
            arr[r2] = temp;
            l2++;
            r2--;
        }


//        int l3 = 0;
//        int r3 = arr.length-l2-1;
//        while(l3<r3){
//            int temp = arr[l3];
//            arr[l3] = arr[r3];
//            arr[r3] = temp;
//            l3++;
//            r3--;
//        }

        System.out.println("Rotated array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
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
        RotateArray(arr);
    }
}
