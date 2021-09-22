/*
* Time Complexity O(n)
* Space Complexity O(1)
*/
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int num: nums){
            sum+=num;
        }
        int n = nums.length+1;
        int expectedSum= (n*(n-1))/2;
        return expectedSum-sum;
    }
}