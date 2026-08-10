package Day10;
import java.util.*;

public class Solution6_EqualArray {
    public static void AreEqualArray(int n,int arr1[], int arr2[]){
        boolean Equal = true;
        for (int i = 0; i < n; i++) {
            if(arr1[i]!=arr2[i]){
                Equal = false;
                break;
            }
        }
        if(Equal){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
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
        AreEqualArray(n,arr1,arr2);
    }
}
