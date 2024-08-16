class Merge_two_list {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }


        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ListNode node = head;

            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    node.next = l1;
                    l1 = l1.next;
                } else {
                    node.next = l2;
                    l2 = l2.next;
                }
                node = node.next;
            }

            if (l1 != null) node.next = l1;
            ;
            if (l2 != null) node.next = l2;
            return head.next;
        }
    }

    public static void main(String args[]) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // 1.3.5 LinkedList created
        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4);

        ListNode mergedList = ListNode.mergeTwoLists(l1, l2);

        ListNode node = mergedList;
        System.out.print("Merged Link List is:\n");
        while (node != null) {
            System.out.print(node.val +  " ");
            node = node.next;
        }
    }
}








