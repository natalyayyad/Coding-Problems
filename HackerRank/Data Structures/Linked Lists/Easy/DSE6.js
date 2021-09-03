// Complete the insertNodeAtTail function below.
// Time complexity 0(n)
// Space complexity O(n) since the amount of data stored increases linearly with the number of nodes in the list

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
function insertNodeAtTail(head, data) {
  let temp = new SinglyLinkedListNode();
  temp.data = data;
  temp.next = null;

  if (head == null) {
    head = temp;
    return temp;
  }

  let current = head;
  while (current.next != null) {
    current = current.next;
  }
  current.next = temp;
  return head;
}
