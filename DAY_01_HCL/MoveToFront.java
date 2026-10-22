package DAY_01_HCL;
import java.util.*;

public class MoveToFront {
    public static void moveForward(String str){
        String str1="", str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '#'){
                str1+=str.charAt(i);
            }else{
                str2+=str.charAt(i);
            }
        }
        System.out.println(str1+str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        moveForward(str);
    }
}
