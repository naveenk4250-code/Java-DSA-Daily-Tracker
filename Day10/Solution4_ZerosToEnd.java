package Day10;
import java.util.*;

public class Solution4_ZerosToEnd {
    public static void MoveAside(int arr[]){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }while(count<arr.length){
            arr[count++] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MoveAside(arr);


    }
}
