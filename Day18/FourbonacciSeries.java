package Day18;
import java.util.*;


public class FourbonacciSeries {

    public static void series(int n){
       if(n == 1){
           System.out.print(1);
       } else if (n == 2) {
           System.out.print(2);
       } else if (n == 3) {
           System.out.print(3);
       } else if (n == 4) {
           System.out.print(4);
       }else{
           int a = 1,b = 2,c = 3,d = 4;
           for (int i = 5; i <= n ; i++) {
                int next = a+b+c+d;
                a = b; b = c; c = d; d = next;
           }
           System.out.print(d);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        series(n);
    }
}
