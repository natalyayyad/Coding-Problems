package easy;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int removeDuplicates(int[] nums) {
		List<Integer> intList = new ArrayList<Integer>(nums.length);
		for (int i : nums)
		{
			if(!intList.contains(i))
				intList.add(i);
		}
		
		for(int i=0; i< nums.length; i++)
		{
		    if(i < intList.size())
		    	nums[i] = intList.get(i);
		    else
		    	nums[i]=0;
		}
		
		return intList.size();
	}
}
