import java.math.BigInteger;

class Solution {
    public int reverse(int x) {
        long resultNumber = 0;
        int mod;
            
        while(x!=0){
         
            mod  = x%10;
            resultNumber = resultNumber*10+ mod;
            x = x/10;
            
        }
        
        if( resultNumber < Integer.MIN_VALUE || resultNumber > Integer.MAX_VALUE ) 
            return 0;
        else
            return (int)resultNumber;
    }
}