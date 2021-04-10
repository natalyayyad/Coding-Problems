package hard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isMatch(String s, String p) {
		if(p.matches("^[a-zA-Z]*$") && s.equals(p))
			return true;
		else {
			for(int i=0; i<s.length(); i++) {
				
			}
		}
		Pattern pattern = Pattern.compile(p);
		Matcher patternMatcher = pattern.matcher(s);
		return patternMatcher.find();

	}
}
