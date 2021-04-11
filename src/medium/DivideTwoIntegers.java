package medium;

public class DivideTwoIntegers {

	public int divide(int dividend, int divisor) {
		int result=0;
		int sign=1;
		
		if(dividend == 0)
			return 0;

		if(dividend<0 &&  divisor>0 || dividend >0 && divisor<0)
			sign=-1;    

		if(dividend==Integer.MIN_VALUE && divisor==-1)
			return Integer.MAX_VALUE;

		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);

		while(dividend-divisor >=0){
			dividend -= divisor;
			result++;
		}

		return sign * result;
	}
}
