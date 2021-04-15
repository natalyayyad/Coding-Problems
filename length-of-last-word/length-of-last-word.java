class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
		try {
			return arr[arr.length-1].length();
		}
		catch(Exception e) {
			return 0;
		}
    }
}