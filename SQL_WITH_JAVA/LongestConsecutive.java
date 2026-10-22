package SQL_WITH_JAVA;
import java.util.*;

public class LongestConsecutive {

    public static void  series(int arr[], int n){
        int count = 1;
        Arrays.sort(arr);

        for (int i = 1; i <n; i++) {
            if(arr[i] != arr[i-1]+1){
                break;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        series(arr, n);
    }
}
