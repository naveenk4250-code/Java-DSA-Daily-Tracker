package Day17;
import java.util.*;

public class Solution2_SearchInSortedArray {

    public static int SearchElement(int arr[], int target){
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            int mid = (st+end)/2;
            if(arr[mid] == target){
                System.out.println(mid);
            }

            if(arr[st]<=arr[mid]) {
                if (target >= arr[st] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            else{
                if(target>=arr[mid] && target<arr[end]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        SearchElement(arr, target);
    }
}
