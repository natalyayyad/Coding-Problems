class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int len = digits.length+1;
        int result[] = new int[len];
        
        if(digits[digits.length-1] + 1 < 10){
            digits[digits.length-1] +=1;
            return digits;
        }
        else{
            digits[digits.length-1]=0;
            carry=1;
        } 
            
        for(int i=digits.length-2; i>=0; i--){
            if(digits[i] + carry < 10){
                digits[i] += carry;
                carry=0;
                break;
            }
               
            else {
                digits[i]= (int)(digits[i] + carry) % 10;
                carry=1;
            }
        }
        if(carry ==1 ){
            for(int j=1; j<result.length; j++){
                result[j] = digits[j-1];
            }
            result[0]=1;
            return result;
        }
        return digits;
    }
}