package easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		

	}
	
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i< nums.length; i++) {
        	if(nums[i] == target)
        		return i;
        }
        
        if(target < nums[0])
        	return 0;
        
        if(target > nums[nums.length-1])
        	return nums.length;
        
        for(int j=0; j< nums.length; j++) {
        	if((target > nums[j]) && (target < nums[j+1]))
        		return j;
        }
		return 0;
        
        
    }

}
