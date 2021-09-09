/*
* Not prefered Solution: count 0 and 1 and 2 then override the array with sorted values O(2N)
* Optimized Solution:
* arr[0 ... low-1] = 0
* arr[high+1 ... n] = 2
* arr[low...mid-1] = 1
* Time Complexity O(n)
* Space Complexity O(1)
*/
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high = nums.length-1;
        int temp;
        
        while(mid<=high){
            switch(nums[mid]){
                case 0:
                    temp = nums[low];
                    nums[low++]= nums[mid];
                    nums[mid++]= temp;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid]= nums[high];
                    nums[high--]= temp;
            }
        }
    }
}