// Complete the insertNodeAtHead function below.
// Time Complexity O(1)
// Space Complexity O(1)
// Each Insertion take O(1).

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
function insertNodeAtHead(head, data) {
  let temp = new SinglyLinkedList();
  temp.data = data;

  if (head == null) {
    temp.next = null;
    head = temp;
    return head;
  } else {
    temp.next = head;
    return temp;
  }
}
