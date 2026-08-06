package Day06;
import java.util.*;

public class Solution3_FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int var = 1;
        for (int i = 1; i <=n ; i++) {
            for(int j = 1;j<=i;j++){
                System.out.print(var+" ");
                var++;
            }
            System.out.println();
        }
    }
}
