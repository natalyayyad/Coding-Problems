package hard;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		int push=0, pop=0, max=0;

		if(s.isEmpty() || s.length()==1)
			return 0;

		for(int i=0; i< s.length(); i++) {
			if(s.charAt(i) == '(')
				push++;
			else
				pop++;

			if(pop == push){
				int len = pop+push;
				max = Math.max(len,max);
			}
			else if(pop >push) {
				pop=0;
				push=0;
			}	
		}
		pop=0;
		push=0;

		for(int i=s.length()-1; i>0; i--) {
			if(s.charAt(i) == '(')
				push++;
			else
				pop++;

			if(pop == push){
				int len = pop+push;
				max = Math.max(len,max);
			}
			else if(push >pop) {
				pop=0;
				push=0;
			}
		}

		return max;
	}
}
