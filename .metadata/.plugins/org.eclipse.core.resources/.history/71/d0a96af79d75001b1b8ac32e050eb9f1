package LeetCode;
import java.util.*;
public class t0002_2021_1_23 {
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
		public class ListNode {
			 int val;
			 ListNode next;
			 ListNode() {}
			 ListNode(int val) { this.val = val; }
			 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		}
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        //init return value
	        LinkedList re = new LinkedList();
	        int carry = 0;
	        //iterator until l1 ends
	        while(l1 != null){
	            int l1val = l1.val;
	            l1 = l1.next;
	            int l2val;
	            if(l2 == null) l2val = 0;
	            else{l2val = l2.val; l2 = l2.next;}
	            int reval = l1val + l2val + carry;
	            re.add(reval%10);
	            carry = reval / 10;
	        }
	        //iterator util l2 ends
	        while(l2 != null){
	            int l2val = l2.val;
	            l2 = l2.next;
	            int reval = l2val + carry;
	            re.add(reval % 10);
	            carry = reval / 10;
	        }
	        //convert from LinkedList to ListNode
	        if(carry == 1) re.add(carry);
	        ListNode RE = new ListNode((int)re.get(0));
	        ListNode q = RE;
	        for(int i = 1; i < re.size(); i++){
	            q.next = new ListNode((int)re.get(i));
	            q = q.next;
	        }
	        return RE;
	    }
	}
}
