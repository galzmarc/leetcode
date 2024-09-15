// public class ListNode {
//   int val;
//   ListNode next;
//   ListNode() {}
//   ListNode(int val) { this.val = val; }
//   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

public class MergeTwoLists {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // Create a dummy node to help build the merged list
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    // Use p1 and p2 as pointers for list1 and list2
    ListNode p1 = list1;
    ListNode p2 = list2;

    while (p1 != null && p2 != null) {
        if (p1.val <= p2.val) {
            current.next = p1;
            p1 = p1.next;
        } else {
            current.next = p2;
            p2 = p2.next;
        }
        current = current.next;
    }
    // If there are remaining nodes in either list, attach them
    if (p1 != null) {
        current.next = p1;
    } else {
        current.next = p2;
    }
    // Return the head of the merged list (skip the dummy node with 0 as value)
    return dummy.next;
  }
}