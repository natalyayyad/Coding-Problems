package hard;

import easy.ListNode;

public class ReverseNodesInKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		if(k<0 || head.next ==null)
			return head;
		if(k==1)
			return head;

		ListNode result = new ListNode(0,head);
		ListNode prevNodes = result;


		while(true){
			ListNode kth = getkth(prevNodes,k);
			if(kth==null)
				break;
			ListNode nextNodes = kth.next;


			ListNode current = prevNodes.next;
			ListNode prev = kth.next;
			ListNode temp = null;


			while (current != nextNodes){
				temp = current.next;
				current.next = prev;
				prev = current;
				current =temp;
			}
			temp = prevNodes.next;
			prevNodes.next=kth;
			prevNodes = temp;
		}

		return result.next;

	}

	public ListNode getkth(ListNode node, int k){
		while((node != null) && k>0){
			node = node.next;
			k--;
		}
		return node;

	}
}
