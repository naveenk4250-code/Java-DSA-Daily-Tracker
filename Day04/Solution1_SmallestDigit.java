package Day04;
import java.util.*;
public class Solution1_SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = n % 10;
        while(n>0){
            int dig = n % 10;
            if(dig<min){
                min = dig;
            }
            n/=10;
        }
        System.out.println(min);
    }
}
