package easy;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()]]]"));
	}

	public static boolean isValid(String s) {
		s=s.replaceAll(" ", "");
		int pointer=0;
		Pattern letter = Pattern.compile("[a-zA-Z]");
		Pattern digit = Pattern.compile("[0-9]");
		Pattern special = Pattern.compile ("[!@#$%&*_+=|<>?~-]");
		Pattern paranthesis = Pattern.compile("[{}()\\[\\]]");
		Matcher hasLetter = letter.matcher(s);
        Matcher hasDigit = digit.matcher(s);
        Matcher hasSpecial = special.matcher(s);
        Matcher hasParanthesis = paranthesis.matcher(s);
        Stack<Character> stackOfChars = new Stack<>();
        
		if(s.isEmpty())
			return true;
		if((s.length()==1) || hasLetter.find() || hasDigit.find() || hasSpecial.find() || !hasParanthesis.find() ||
				(s.charAt(s.length()-1) == '{') || (s.charAt(s.length()-1) == '[') || (s.charAt(s.length()-1) == '(') || 
				((s.charAt(0) != '{')  && (s.charAt(0) != '[') && (s.charAt(0) != '('))) {
			return false;
		}
		
		for(int i=0; i< s.length(); i++) {
			if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
				stackOfChars.push(s.charAt(i));
				pointer++;
			}
			else if(!stackOfChars.isEmpty()) {
				Character c = stackOfChars.pop();
				if(!(s.charAt(i)==']' && c=='[') && !(s.charAt(i)=='}' && c=='{') && !(s.charAt(i)==')' && c=='(')) {
					return false;
				}
				else
					pointer--;
			}
			else 
				return false;
				
			
		}
		if(pointer==0)
			return true;
		else
			return false;

	}

}
