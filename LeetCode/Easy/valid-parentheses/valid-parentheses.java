import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean isValid(String s) {
		int pointer=0;
        Stack<Character> stackOfChars = new Stack<>();
        
		if(s.isEmpty())
			return true;
		if((s.length()==1) ||
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