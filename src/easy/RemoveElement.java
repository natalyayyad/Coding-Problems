package easy;

public class RemoveElement {

	public static void main(String[] args) {
	}


	public static int removeElement(int[] nums, int val) {
		if(nums.length ==0)
			return 0;
		int j=0;
		for(int i=0; i< nums.length; i++) {
			if(nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}

		}
		if(j<nums.length) nums[j]='\0';
		
		return j; 

		//return j+1;
	}

}
