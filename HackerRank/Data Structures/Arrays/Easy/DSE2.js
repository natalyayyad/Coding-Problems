/*
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 * O(n*m) time complexity and O(1) space complexity.
 */

function hourglassSum(arr) {
  // Write your code here
  var rows = arr.length;
  var columns = arr[0].length;
  var max = -63;
  for (let i = 0; i < rows - 2; i++) {
    for (let j = 0; j < columns - 2; j++) {
      var subsum =
        arr[i][j] +
        arr[i][j + 1] +
        arr[i][j + 2] +
        arr[i + 1][j + 1] +
        arr[i + 2][j] +
        arr[i + 2][j + 1] +
        arr[i + 2][j + 2];

      if (subsum > max) max = subsum;
    }
  }
  return max;
}
