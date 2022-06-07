class Solution {
    public int trap(int[] height) {
        
        if(height.length < 2)
            return 0;
        
        int water=0;
        int left=1;
        int right=height.length-2;
        int leftMax=height[0];
        int rightMax=height[height.length-1];
        
        while(left<=right){
            if(leftMax < rightMax){
               if(height[left] < leftMax){
                water += leftMax-height[left];
                } else {
                leftMax = height[left];
                }  
                left++;
            } else {
                if(height[right] < rightMax){
                water += rightMax-height[right];
                } else {
                rightMax = height[right];
                }  
                 right--;
            }
        }
        return water;
    }
}