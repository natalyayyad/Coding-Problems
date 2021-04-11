package medium;

import easy.ListNode;

public class RemoveDuplicatesfromSortedList2 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode result = new ListNode(0,head);
		ListNode temp = result;

		while(head != null) {
			if(head.next != null && head.val == head.next.val){
				while(head.next != null && head.val == head.next.val){
					head = head.next;
				}
				temp.next = head.next;
			}
			else{
				temp = temp.next;
			}
			head = head.next;
		}
		return result.next;
	}
}
