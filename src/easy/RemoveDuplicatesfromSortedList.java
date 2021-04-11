package easy;

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode temp = new ListNode(0);
		temp.next=head;

		while(head != null && head.next != null) {
			if(head.val == head.next.val) {
				head.next = head.next.next;
			}else {
				head = head.next;
			}
		}

		return temp.next;

	}
}
