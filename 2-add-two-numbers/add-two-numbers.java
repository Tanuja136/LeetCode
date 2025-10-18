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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to simplify handling head of the result list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // Traverse both linked lists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with previous carry
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Update carry for next iteration
            carry = sum / 10;

            // Create new node with current digit
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        // Return the next of dummy (head of actual result)
        return dummy.next;
    }
}
