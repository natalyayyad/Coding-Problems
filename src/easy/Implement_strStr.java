package easy;

public class Implement_strStr {

	public static void main(String[] args) {
		String haystack, needle;
		haystack = "aaaaa";
		needle = "bba";
		System.out.println(strStr(haystack, needle));

	}

	public static int strStr(String haystack, String needle) {
		if(needle.length() ==0)
			return 0;

		return haystack.indexOf(needle);
	}

}
