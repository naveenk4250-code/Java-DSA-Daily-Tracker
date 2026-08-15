package Day14;
import java.util.*;

public class Solution1_MergeSortedArray {

    public static int[] MergeArray(int arr1[],int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int merged[] = new int[n1+n2];
        int i = 0,j = 0,k = 0;
        while(i<n1 && j<n2){
           if(arr1[i]<arr2[j]){
               merged[k] = arr1[i];
               i++;
           }else{
               merged[k] = arr2[j];
               j++;
           }
           k++;
        }
       while(i<n1){
           merged[k] = arr1[i];
           i++;
           k++;
       }

       while(j<n2){
           merged[k] = arr2[j];
           j++;
           k++;
       }
        return merged;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int res[] = MergeArray(arr1,arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

    }
}
