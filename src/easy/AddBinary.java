package easy;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public String addBinary(String a, String b) {
	       String res="";
			int carry=0;
			String reverse="";
	        int m=0;
			for(int i=a.length()-1; i>=0; i--){
				for(int j=b.length()-1; j>=0; j--){
					if(carry==0){
						if((a.charAt(i)=='1' && b.charAt(j)=='0') || (a.charAt(i)=='0' && b.charAt(j)=='1')){
	                        res +="1";
	                    }
							
						else if (a.charAt(i)=='0' && b.charAt(j)=='0'){
	                        res +="0";
	                    }
							
						else if(a.charAt(i)=='1' && b.charAt(j)=='1'){
							res +="0";
							carry=1;
						}

					}

					else {
						if((a.charAt(i)=='1' && b.charAt(j)=='0') || (a.charAt(i)=='0' && b.charAt(j)=='1')){
							res +="0";
							carry=1;
						}

						else if (a.charAt(i)=='0' && b.charAt(j)=='0'){
							res +="1";
							carry=0;
						}
						else if(a.charAt(i)=='1' && b.charAt(j)=='1'){
							res +="1";
							carry=1;
						}

					}
	                break;
				}
			}
	        System.out.println(res);
	        int k=0;
	        
	        if(a.length() > b.length()){
	            k = a.length() - b.length() - 1;
	            while(k >= 0){
	            if(carry==1){
	                if(a.charAt(k)=='0'){
	                    res +="1";
	                    carry=0;
	                }
	                else {
	                    res +="0";
	                    carry=1;
	                }
	            }
	            else {
	                 if(a.charAt(k)=='0'){
	                    res +="0";
	                    carry=0;
	                }
	                else {
	                    res +="1";
	                    carry=0;
	                }
	                
	            }
	            k--;
	        }
	        
	        }
	            
	        else if (a.length() < b.length()){
	             k = b.length() - a.length() -1;
	             while(k>=0) {
	            if(carry==1){
	                if(b.charAt(k)=='0'){
	                    res +="1";
	                    carry=0;
	                }
	                else {
	                    res +="0";
	                    carry=1;
	                }
	            }
	            else {
	                 if(b.charAt(k)=='0'){
	                    res +="0";
	                    carry=0;
	                }
	                else {
	                    res +="1";
	                    carry=0;
	                }
	                
	            }
	            k--;
	        }
	        
	        }
	        
	        if(carry==1)
	            res +="1";
	        
	        for(int j = res.length() - 1; j >= 0; j--) {
	            reverse += res.charAt(j);
	        }
	        return reverse;
	    }
}
