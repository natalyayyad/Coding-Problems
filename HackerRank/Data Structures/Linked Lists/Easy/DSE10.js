/*
 * Complete the 'reversePrint' function below.
 *
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

// Time Complexity O(n)
// Space Compelxity O(1)
function reversePrint(llist) {
  // Write your code here - SOL1
  var arr = [];
  if (llist == null) {
    console.log();
  }

  while (llist.next != null) {
    arr.push(llist.data);
    llist = llist.next;
  }
  arr.push(llist.data);

  arr.reverse();
  for (const element of arr) {
    console.log(element);
  }

  // Write your code here - SOL2 MUCH BETTER

  if (llist == null) {
    console.log();
  }

  if (llist.next != null) {
    reversePrint(llist.next);
  }
  console.log(llist.data);
}
