package easy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LongestCommonPrefix implements Comparator<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//["flower","flow","flight"]
		//		["dogs", "racecar", "car"]
		//		[]
		//		["a"]
			//	["ab", "a"]
				//["reflower","flow","flight"]
				//["flower","flower","flower","flower"]
			//	["c","acc","ccc"]
		String [] strs =  {"c","acc","ccc"};
		System.out.println(longestCommonPrefix(strs));
	}

	@Override
	public int compare(String s1, String s2) {
		return s2.length() - s1.length();
	}

	public static String longestCommonPrefix(String[] strs) {
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
		
		//for (int i = 0; i < s.length(); i++)
			//for (int j = i+1; j <= s.length(); j++)
				//substrings.add(s.substring(i, j));
		
		LongestCommonPrefix ss = new LongestCommonPrefix();
		Collections.sort(substrings, ss);
		System.out.println(substrings);

		for(int i=0; i<substrings.size(); i++) {
			for(int j=1; j<strs.length; j++) {
				if (strs[j].indexOf(substrings.get(i)) ==0) {
					System.out.println(strs[j] + '\t' +  i + '\t' + count);
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
