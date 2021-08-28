/*
 * Complete the 'dynamicArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY queries
 * Time complexity O(2n) and Space Complexity O(2n)
 */

function dynamicArray(n, queries) {
  // Write your code here
  var arr = new Array(n);
  for (let i = 0; i < n; i++) {
    arr[i] = [];
  }
  var lastAnswer = 0,
    idx = 0,
    answers = [];
  for (const x of queries) {
    idx = (x[1] ^ lastAnswer) % n;
    if (x[0] === 1) {
      arr[idx].push(x[2]);
    } else {
      lastAnswer = arr[idx][x[2] % arr[idx].length];
      answers.push(lastAnswer);
    }
  }
  return answers;
}
