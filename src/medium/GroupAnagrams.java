package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		List<String> wordList = Arrays.asList(strs);  
		List<String> tmp = new ArrayList<>();
		int count=0;
		List<List<String>> groups = new ArrayList<List<String>>();
        
        if( strs.length ==0 || strs.length ==1 ) {
			groups.add(wordList);
			return groups;
		}
		
		for(int i=0; i<wordList.size(); i++) {
			tmp.clear();
			tmp.add(wordList.get(i));
			for(int j=i+1; j< wordList.size(); j++) {
				if(wordList.get(i).length() == wordList.get(j).length() ) {
					for(int k=0; k<wordList.get(i).length(); k++) {
						if(wordList.get(j).indexOf(wordList.get(i).charAt(k)) != -1)
							count++;
					}
					if(count == wordList.get(i).length()) {
						tmp.add(wordList.get(j));
					}
				}
			}
            for(String st : tmp)
				System.out.println(st);
			groups.add(tmp);
            System.out.println();
			
		}
		return groups;
	}

}
