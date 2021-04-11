package hard;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		java.util.Arrays.sort(nums);
		boolean flag = false;
		int min=2;

		for(int i=0 ; i<nums.length; i++){
			if(nums[i] == 1)
				flag=true;

			if(nums[i] == min)
				min++;

		}

		if(flag)
			return min;
		else
			return 1;

	}
}
