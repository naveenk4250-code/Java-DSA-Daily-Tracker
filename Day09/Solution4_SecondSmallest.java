package Day09;
import java.util.*;

public class Solution4_SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int Smallest = Integer.MAX_VALUE;
        int SecSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]<Smallest){
                SecSmallest = Smallest;
                Smallest = arr[i];
            }else if(arr[i]<SecSmallest && arr[i]!=Smallest){
                SecSmallest = arr[i];
            }

        }
        System.out.println(SecSmallest);

    }
}