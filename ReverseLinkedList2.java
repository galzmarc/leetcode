class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode prev = null;
        ListNode curr = head;
        // Keep traversing the list until you reach left pointer
        for (int i = 1; i < left; i++) {
            prev = curr;
            curr = curr.next;
        }
        // Reverse the list between left and right pointers
        ListNode connection = prev; // Node before the `left` node
        ListNode tail = curr;       // The `left` node will become the tail of the reversed sublist
        
        ListNode temp = null;
        for (int i = left; i <= right; i++) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        // Reconnect the reversed sublist back to the list
        if (connection != null) {
            connection.next = prev; // Connect node before `left` to the start of the reversed sublist
        } else {
            head = prev; // Update head if reversing from the first node
        }
        tail.next = curr; // Connect the end of the reversed sublist to the rest of the list
        return head;
    }
}