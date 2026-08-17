package Day15;
import java.util.*;

public class Solution3_RotationOfEachOther {

    public void  ShiftCharacter(String str1,String str2){


        if(str1.length()!=str2.length()){
            System.out.println("Not a rotation of string");
            return;
        }
        String str3 = str1+str1;
        if(str1.length()!=str2.length()){
            System.out.println("Not Rotation of each other");
        }

        boolean found = str3.contains(str2);
        System.out.println(found);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution3_RotationOfEachOther s3 = new Solution3_RotationOfEachOther();
        s3.ShiftCharacter(str1,str2);
    }
}
