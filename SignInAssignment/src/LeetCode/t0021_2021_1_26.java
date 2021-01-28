package LeetCode;

public class t0021_2021_1_26 {
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

	class Solution {
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode re = new ListNode(-1);
	        ListNode iter = re;
	        while(l1 != null){
	            if(l2 == null){iter.next = l1; return re.next;}
	            if(l1.val < l2.val){iter.next = l1; l1 = l1.next; iter = iter.next;}
	            else{iter.next = l2; l2 = l2.next; iter = iter.next;} 
	        }
	        //l1 = null
	        iter.next = l2;
	        return re.next;
	    }
	}
}
