package Day14;
import java.util.*;

public class Solution7_NextGreaterElement {
    public static int[] Greater(int arr[], int n){
        int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >= 0 ; i--) {
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : arr[st.peek()];
            st.push(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]+" ");
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Greater(arr,n);
    }
}
