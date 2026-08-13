package Day13;
import java.util.*;


public class Solution5_ValidParanthesis {
    public static boolean Valid(String str){
        while(true){
            if(str.contains("()")){
                str = str.replace("()","");
            }else if(str.contains("{}")){
                str = str.replace("{}","");
            }else if(str.contains("[]")){
                str = str.replace("[]","");
            }else{
                return str.isEmpty();
            }

        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Valid(str));
    }
}
