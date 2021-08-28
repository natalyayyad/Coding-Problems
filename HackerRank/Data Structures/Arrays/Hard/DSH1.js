/*
 * Complete the 'arrayManipulation' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY queries
 * SOL1 : Time complexity O(m* (b-a)) and Space Complexity O(n)
 * SOL2: Time Complexity O(m + n ) ~ O(n) and Space Complexity O(1)
 */

function arrayManipulation(n, queries) {
  // Write your code here - SOL 1 - NEEDS OPTIMIZATION
  var arr = new Array(n).fill(0);
  var max = Number.MIN_VALUE;
  for (const q of queries) {
    for (let i = q[0] - 1; i <= q[1] - 1; i++) {
      arr[i] += q[2];
      if (arr[i] > max) max = arr[i];
    }
  }
  return max;

  // write your code here - SOL2 - OPTIMIZED
  // Write your code here
  var arr = new Array(n).fill(0);
  var max = Number.MIN_VALUE;
  var curr = 0;
  for (const q of queries) {
    var start = q[0] - 1;
    var end = q[1];
    var val = q[2];
    arr[start] += val;
    arr[end] -= val;
  }

  for (const value of arr) {
    curr += value;
    if (curr > max) {
      max = curr;
    }
  }

  return max;
}
