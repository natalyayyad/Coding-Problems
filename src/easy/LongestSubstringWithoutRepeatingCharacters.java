package easy;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "pwwkew";
		int count=0;
		int index=1;
		
		// if(s.length() <2){
		  //      return s.length();
		   // }
		 
		while(index < s.length()) {
			for(int i=0; i< s.length()-1; i++) {
				if(i+index > s.length()-1) {
					break;
				}
				else if (s.contains(s.substring(i, i+index))) {
					count = Math.max(count, s.substring(i, i+index).length());
				}
				
			}
			index++;
			
		}
		
		System.out.println(count);
		
		// TODO Auto-generated method stub

	}

}
