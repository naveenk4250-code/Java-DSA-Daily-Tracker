package Day12;
import java.util.*;

public class Solution2_insersectionOfArrays {
    public static int Insersection(int n, int arr1[], int arr2[]){
        HashSet<Integer> hs1 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs1.add(arr1[i]);
        }

        boolean found = true;
        for (int i = 0; i < n; i++) {

            if(hs1.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
                found = true;
            }
            hs1.remove(arr2[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        Insersection(n,arr1,arr2);
    }
}
