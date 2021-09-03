/*
 * Complete the 'insertNodeAtPosition' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
 * The function accepts following parameters:
 *  1. INTEGER_SINGLY_LINKED_LIST llist
 *  2. INTEGER data
 *  3. INTEGER position
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
// Space Complexity  O(1)

function insertNodeAtPosition(llist, data, position) {
  // Write your code here
  let temp = new SinglyLinkedList();
  temp.data = data;
  var i = 0;

  let current = llist;
  while (current.next != null) {
    i++;
    if (position == i) {
      let next = current.next;
      current.next = temp;
      temp.next = next;
      return llist;
    }
    current = current.next;
  }
}
