/*
 * Complete the 'reverseArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY a as parameter.
 * This is a simple algorithm and time complexity is O(n/2) or O(n) because it needs to iterate over almost half the elements and perform n/2 swapping as well.
 * The space complexity of the algorithm is O(1) because no matter how big the array is, it requires the same space.
 */

function reverseArray(a) {
  // Write your code here
  var size = a.length;
  for (let i = 0; i < a.length / 2; i++) {
    const temp = a[i];
    a[i] = a[size - 1];
    a[size - 1] = temp;
    size--;
  }

  return a;
}
