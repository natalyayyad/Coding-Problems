/*
 * Complete the 'reverse' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
 * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
 */

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */

//Time Complexity O(n) & space complexity O(1)
function reverse(llist) {
  // iterative method
  let prev = null;
  let current = llist;
  let next;
  while (current != null) {
    next = current.next;
    current.next = prev;
    prev = current;
    current = next;
  }
  llist = prev;
  return llist;

  // Recursive Method
  if (llist == null) {
    return null;
  }

  if (llist.next == null) return llist;

  let node = reverse(llist.next);
  llist.next.next = llist;
  llist.next = null;

  return node;
}
