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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr1 = head;
        ListNode prev = head;
        if(head == null){   // if list is empty
            return null;
        }
        while(head!=null && head.val==val){ //if first element itself is the value
            
           head=head.next;
        }
        while(curr1!=null){
            if(curr1.val == val){
                curr1=curr1.next;
                prev.next=curr1;
                
            }else{
                prev=curr1;
                curr1=curr1.next;
            }
        }
        return head;
    }
}