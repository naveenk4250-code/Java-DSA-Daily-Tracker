package Day17;
import java.util.*;

public class Solution1_MedianOfSortedArray {

    public static  void sort(int[] arr){
        if(arr.length<2) return;

        int mid = arr.length/2;
        int left[] = new int[mid];
        int right[] = new int[arr.length-mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for(int i = mid;i< arr.length;i++)
            right[i-mid] = arr[i];

        sort(left);
        sort(right);
        merge(arr,left,right);
    }

    public static void merge(int arr[], int left[], int right[]) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];

                i++;
        }else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);
        for(int i:arr)
            System.out.print(i+" ");

        double median = 0;
        if(arr.length%2!=0){
            int mid = arr.length/2;
            median = arr[mid];
            System.out.println("Median is: "+median);
        }else{
            int mid = arr.length/2;
            median = (arr[mid]+arr[mid-1])/2.0;
            System.out.println("median is: "+median);

        }
    }
}
