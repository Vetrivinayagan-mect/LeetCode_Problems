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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        int sum=0;
        while(curr!=null){
            count--;
            sum = sum +(int)(curr.val*Math.pow(2,count));
            curr=curr.next;
        }
        return sum;
    }
}
