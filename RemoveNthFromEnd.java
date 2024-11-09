/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
      // initialize two pointers
      ListNode l = head;
      ListNode r = head;
      // move second pointer by n nodes
      for (int i = 0; i < n; i++) {
          r = r.next;
      }
      // if r is null after moving n steps, remove the head node
      if (r == null) {
          return head.next;
      }
      // keep going until r pinter reaches the end of the list
      while (r.next != null) {
          l = l.next;
          r = r.next;
      }
      // skip the target node
      l.next = l.next.next;
      return head;
  }
}
