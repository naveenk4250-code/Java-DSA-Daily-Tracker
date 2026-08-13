package Day13;
import java.util.*;

public class Solution5_Valid2 {

    public static boolean ValidPar(String str){
        Stack<Character> st = new Stack<>();
        for(char c:str.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                char top = st.pop();
                if(c == '}' && top != '{') return false;
                if(c == ')' && top != '(') return false;
                if(c == ']' && top != '[') return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isValid = ValidPar(str);
        System.out.println(isValid?"Valid":"Not Valid");
    }
}
