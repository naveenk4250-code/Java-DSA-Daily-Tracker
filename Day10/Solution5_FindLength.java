package Day10;
import java.util.*;
public class Solution5_FindLength {
    public static int Count(String str){
        int count = 0;
        try{
            while(true){
                char c = str.charAt(count);
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e){
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Count(str);
        System.out.println(n);
    }
}
