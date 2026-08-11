package Day11;
import java.util.*;

public class SOlution1_MaxDifference {
    public static int Difference(int arr[]){
        int min = arr[0];

        int diff = 0;
        if(arr.length<2){
            return 0;
        }
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]-min>diff){
                diff = arr[i] - min;
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Difference(arr));
    }
}
