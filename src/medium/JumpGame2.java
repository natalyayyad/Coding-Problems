package medium;

public class JumpGame2 {
	 public int jump(int[] nums) {
	        int max=0;
	        int reach=0;
	        int jump=0;
	        if(nums.length==1)
	            return 0;
	        for(int i=0; i<nums.length-1; i++){
	            if(nums[i]+i > max){
	                max = i + nums[i];
	            }
	            if(i==reach){
	                jump++;
	                reach = max;
	            }
	                
	        }
	        return jump;
	    }
}
