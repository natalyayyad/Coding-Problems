class Solution {
    public int maxSubArray(int[] nums) {
        /* Space Complexity O(N^2)
        if(nums.length ==0)
			return 0;
		
		if(nums.length == 1)
			return nums[0];
		
		int index=0, sum=0;
		int max=Integer.MIN_VALUE;
		while(index < nums.length) {
			for(int i=index; i< nums.length; i++) {
				sum += nums[i];
				max = Math.max(max, sum);

			}
            sum=0;
			index++;
		}
		return max;
        */
        // Space Complexity O(N)
        
        int sum=0;
        int max = nums[0];
        for(int num : nums){
            sum +=num;
            max = Math.max(max,sum);
            if(sum <0) sum=0;
        }
        return max;
    }
}