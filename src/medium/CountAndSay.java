package medium;

public class CountAndSay {
	public String countAndSay(int n) {
		if(n<=0)
			return "";
		if(n==1)
			return "1";

		String s="1";
		for(int i=2; i<=n; i++){
			StringBuilder res = new StringBuilder();
			char prev = s.charAt(0);
			int count=1;
			for(int j=1; j<s.length(); j++){
				if(prev !=s.charAt(j)){
					res.append(count);
					res.append(prev);
					prev = s.charAt(j); 
					count=1;

				}else{
					count++;    
				}
			}
			res.append(count);
			res.append(prev);
			s = res.toString();
		}
		return s;
	}
}
