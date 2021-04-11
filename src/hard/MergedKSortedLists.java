package hard;

import easy.ListNode;

public class MergedKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		ListNode result = null;
		if(lists.length ==0)
			return result;
		else if(lists.length ==1)
			return lists[0];
		else {
			result  = mergeTwoLists(lists[0], lists[1]);
			if(lists.length > 2) {
				for(int i =2; i< lists.length-1; i++) {
					result  = mergeTwoLists(result, lists[i]);
				}
			}else
				return result;
		}  
		return result;

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;

		while(l1 != null || l2 != null) {
			if(l1.val < l2.val) {
				l1.next = mergeTwoLists(l1.next, l2);
				return l1;
			}
			else {
				l2.next = mergeTwoLists(l1, l2.next);
				return l2;
			}
		}
		return l2;

	}

}
