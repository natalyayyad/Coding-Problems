package easy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		

	}

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
