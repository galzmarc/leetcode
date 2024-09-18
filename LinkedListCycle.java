/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class LinkedListCycle {
  /* Approach: use two pointers moving at different speeds, i.e. advance by 1 and 2
  * If at any point p2 == p1, there is a cycle
  */
  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) return false;
    
    ListNode p1 = head, p2 = head;

    while (p2 != null && p2.next != null) {
      p1 = p1.next;
      p2 = p2.next.next;

      if (p1 == p2) {
        return true;
      }
    }

    return false;
  }
}