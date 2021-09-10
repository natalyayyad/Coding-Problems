/*
* Floyd's Algorithm
* Time Complexity O(n)
* Space Complexity O(1)
*/
class Solution {
    public int findDuplicate(int[] nums) {
        // The following code works only when you have one duplicated with no repetition
        /*
        int expectedSum = ((nums.length-1) * (nums.length))/2;
        int sum=0;
        for(int num : nums){
            sum+=num;
        }
        return sum - expectedSum;
        */
        int slow = nums[0];
        int fast = nums[0];
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            
            if(slow == fast)
                break;
        }
        
        int ptr1 = nums[0];
        int ptr2 = slow;
        while(ptr1 != ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }
}