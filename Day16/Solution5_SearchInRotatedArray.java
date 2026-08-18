package Day16;
import java.util.*;
public class Solution5_SearchInRotatedArray {
    public static int search(int arr[], int n, int target){

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("-1");
        }
        return target;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        search(arr,n,k);
    }
}
