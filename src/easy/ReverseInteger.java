package easy;
import java.math.BigInteger;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = -123;
		long rev = 0;
        int rem;
        int n = x;
            
        while(n!=0){
         
            rem  = n%10;
            rev = rev*10+rem;
            n = n/10;
            
        }
	        

	}

}
