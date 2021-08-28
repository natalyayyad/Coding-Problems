/*
 * Complete the 'rotateLeft' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER d
 *  2. INTEGER_ARRAY arr
 * Time and Space Complexity = O(n)
 */

function rotateLeft(d, arr) {
  // Write your code here - SOL1
  var temp = [];
  var index = 0;
  for (let i = d; i < arr.length; i++) {
    temp.push(arr[i]);
  }

  while (index !== d) {
    temp.push(arr[index++]);
  }

  return temp;

  // Write your code here - SOL2
  //var temp = [];
  //for(let i=0; i< arr.length; i++){
  //    temp[(i + arr.length - d)% arr.length] = arr[i];
  //}
  //return temp;
}
