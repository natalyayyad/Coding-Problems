package easy;

public class MaximumSubarray {

	public static void main(String[] args) {

	}

	public int maxSubArray(int[] nums) {
		if(nums.length ==0)
			return 0;
		
		if(nums.length ==1)
			return nums[0];
		
		int index=0, sum=0;
		int max=Integer.MIN_VALUE;
		while(index < nums.length) {
			for(int i=index; i< nums.length; i++) {
				sum += nums[i];
				max = Math.max(max, sum);

			}
			index++;
		}
		return max;
	}

}
