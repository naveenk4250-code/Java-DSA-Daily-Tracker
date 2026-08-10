package Day10;
import java.util.*;

public class Solution2_CountPosNeg {
    public int count(int n,int arr[]){
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<0){
                neg++;
            }else if(arr[i] == 0){
                zero++;
            }else{
                pos++;
            }
        }
        System.out.println("Positive: "+pos);
        System.out.println("Negative: "+neg);
        System.out.println("zero: "+zero);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution2_CountPosNeg c = new Solution2_CountPosNeg();
        c.count(n,arr);
    }
}
