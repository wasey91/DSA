public class LinkedList {


     class  ListNode {
         int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public  boolean hasCycle(ListNode head) {
            ListNode s= head;
            ListNode f = head;
            while(s != null && f != null && f.next != null){
                s = s.next;
                f = f.next.next;
                if(s == f){
                    return true;
                }

            }
            return false;
        }
    }
    public void main(String[] args) {


        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        head.next.next.next.next.next = new ListNode(60);

        head.next.next.next.next = head;

        if (hasCycle( head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }



}
