package medium;

import java.math.BigInteger;

public class MutiplySttrings {
	public String multiply(String num1, String num2) {
        BigInteger i=new BigInteger(num1);
        BigInteger j=new BigInteger(num2);
        return ((i.multiply(j)))+"";
    }
}
