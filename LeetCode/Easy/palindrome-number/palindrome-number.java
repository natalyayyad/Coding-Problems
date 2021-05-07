class Solution {
    public boolean isPalindrome(int x) {
        boolean ans = false;
        String temp = Integer.toString(x);
        if(temp.length() == 1 || x==0)
            return true;
        if(x<0)
            return false;
        else{
            
            for(int i=0; i<temp.length()/2;i++){
                if(temp.charAt(i) == temp.charAt(temp.length()-1-i))
                    ans = true;
                else {
	                	 ans = false;
	                	 break;
	                }
	           
            }
                return ans;
        }
    }
}