/*
 * Complete the 'deleteNode' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
 * The function accepts following parameters:
 *  1. INTEGER_SINGLY_LINKED_LIST llist
 *  2. INTEGER position
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

// Time Complexity O(n)
// Space Complexity O(1), used a temp variable to keep track of current node, hence the space complexity is O(1).

function deleteNode(llist, position) {
  // Write your code here
  if (llist == null) {
    return null;
  }

  if (position == 0) {
    return llist.next;
  }

  var i = 1;
  let prev = llist;
  while (prev.next != null) {
    let current = prev.next;
    if (current.next != null && position == i) {
      prev.next = current.next;
      return llist;
    }
    i++;
    prev = prev.next;
  }
}
