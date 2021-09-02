/*
 * Complete the 'matchingStrings' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY strings
 *  2. STRING_ARRAY queries
 * Time complexity O(n^2) - can be optimized with hash map to O(n), Space complexity O(n)
 */

function matchingStrings(strings, queries) {
  // Write your code here
  var temp = [];
  for (const q of queries) {
    var i = 0;
    for (const str of strings) {
      if (q === str) {
        i++;
      }
    }
    temp.push(i);
  }
  return temp;
}
