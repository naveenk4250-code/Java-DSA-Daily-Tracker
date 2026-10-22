package Day18;
import java.util.*;

public class Solution2_SortedArrayOrNot {
    public static int sort(int arr[]){

        boolean sorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.print("Sorted Array");
        }else{
            System.out.println("Not Sorted");
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
        sort(arr);
    }
}
