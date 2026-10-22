package SQL_WITH_JAVA;
import java.util.*;

public class ValidParanthesis {

   public static boolean Check(String str){
       Stack<Character> st = new Stack<>();
       for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[')
           {
               st.push(str.charAt(i));
           }else{
               if(st.isEmpty()){
                   return false;
               }

               char top = st.pop();
               if(str.charAt(i) =='}' && top!='{') return false;
               if(str.charAt(i) ==']' && top!='[') return false;
               if(str.charAt(i) ==')' && top!='(') return false;
           }
       }
      return st.isEmpty();
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       System.out.println(Check(str));
   }
}
