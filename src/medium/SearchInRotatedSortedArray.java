package medium;

public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		/*  int index=-1;
        for(int i=0;i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }

        }
        return index; */

		//faster:

		int index=-1;
		//if(nums.length==1 && nums[0]==target)
		//    return 0;

		for(int i=0; i<=nums.length/2; i++){
			if(nums[i]==target){
				return i;
			}
			else if(nums[nums.length-1-i]==target){
				return nums.length-1-i;
			}  
		}
		return index;
	}
}
