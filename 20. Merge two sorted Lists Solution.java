// code by Puneet 
// please visit to explanation file of this code to understand the approach
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
		if(list2 == null) return list1;
		if(list1.val <= list2.val){
			list1.next = mergeTwoLists(list1.next, list2);
            // 1. (2,4,n & 1,3,4,n) 1->1->2->3->4->4->->n
            // 3. (4,n & 3,4,n) returns 3->4->4->n
            // 5. (n & 4,n)  returns list 2 i.e 4->n
			return list1;
		} else{
			list2.next = mergeTwoLists(list1, list2.next);
            // 2. (2,4,n & 3,4,n) returns 2->3->->4->4->n
            // 4. (4,n & 4,n)  returns 4->4->n
			return list2;
		}
    }
}
