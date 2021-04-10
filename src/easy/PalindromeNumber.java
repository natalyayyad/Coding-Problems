package easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1000021));
	}
	
	 public static boolean isPalindrome(int x) {
	        boolean ans = false;
	        if(((int)(Math.log10(x)+1)) == 1 || x==0)
	            return true;
	        if(x<0)
	            return false;
	        else{
	            String temp = Integer.toString(x);
	            System.out.println(temp);
	            for(int i=0; i<((int)(Math.log10(x)+1))/2;i++){
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
