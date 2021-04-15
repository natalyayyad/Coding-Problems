import java.util.ArrayList;
import java.util.List;

class Solution {
    public int removeDuplicates(int[] nums) {
       List<Integer> intList = new ArrayList<Integer>(nums.length);
		for (int i : nums)
		{
			if(!intList.contains(i)){
                intList.add(i);
            }
        }
            
        for(int k=0; k< nums.length; k++)
		{
		    if(k < intList.size())
		    	nums[k] = intList.get(k);
		    else
		    	nums[k]=0;
		}
				
		return intList.size();
	}
}