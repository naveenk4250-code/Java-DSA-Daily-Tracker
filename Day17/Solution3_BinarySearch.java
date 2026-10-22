package Day17;
import java.util.*;

public class Solution3_BinarySearch {

    public static int BinarySearch(int arr[], int target){

        int st = 0;
        int end = arr.length-1;
        int mid = 0;
        while(st<=end){
            mid = (st+end)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            } else if (arr[mid]<target) {
                st = mid+1;
            }else{
                end = mid-1;
            }
        }return mid;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        BinarySearch(arr,target);
    }
}
