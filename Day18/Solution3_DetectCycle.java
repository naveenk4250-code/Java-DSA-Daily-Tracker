package Day18;
import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}
public class Solution3_DetectCycle {
    public static boolean hasCycle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         ListNode[] nodes = new ListNode[n];

         for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            nodes[i] = new ListNode(val);
         }

         for (int i = 0; i <n-1; i++) {
            nodes[i].next = nodes[i+1];
         }

         int pos = sc.nextInt();
         if(pos!=-1){
             nodes[n-1].next = nodes[pos];
         }

         System.out.println(hasCycle(nodes[0]));

    }
}
