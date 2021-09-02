// Complete the printLinkedList function below.
// Time complexity O(n)
// Space Complexity O(1)

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
function printLinkedList(head) {
  while (head != null) {
    console.log(head.data);
    head = head.next;
  }
}
