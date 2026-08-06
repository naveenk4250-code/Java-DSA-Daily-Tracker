package Day06;
import java.util.*;
public class Solution1_StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for(int k = 0;k<n;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
