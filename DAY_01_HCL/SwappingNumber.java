package DAY_01_HCL;
import java.util.*;

public class SwappingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = arr.length-1;
        int s = 0;

        int temp = arr[s];
        arr[s] = arr[l];
        arr[l] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
