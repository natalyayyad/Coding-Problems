import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution implements Comparator<String>{
    @Override
	public int compare(String s1, String s2) {
		return s2.length() - s1.length();
	}
    
    public String longestCommonPrefix(String[] strs) {
      int count=0;
		String s;
		if(strs.length == 0)
			return "";
        if(strs.length == 1)
            return strs[0];
		
		s = strs[0];
		ArrayList<String> substrings = new ArrayList<String>();
		
		for(int i=1; i<=s.length(); i++)
			substrings.add(s.substring(0, i));
		
		Solution ss = new Solution();
		Collections.sort(substrings, ss);

		for(int i=0; i<substrings.size(); i++) {
			for(int j=1; j<strs.length; j++) {
				if (strs[j].indexOf(substrings.get(i)) ==0) {
					count++;
				}
			}
			if(count == strs.length-1)
				return substrings.get(i);
			else 
				count=0;

		}
		return "";
    }
}