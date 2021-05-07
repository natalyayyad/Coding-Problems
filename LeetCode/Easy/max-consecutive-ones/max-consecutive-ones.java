class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
      	int result = 0, count=0;

		for (int num : nums) {
			if (num == 0) {
				count = 0;
			} else {
				count++;
				result = Math.max(result, count);
			}
		}

		return result;  
    }
}