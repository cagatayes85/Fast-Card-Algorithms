package com.cagatayyapici.luhn;

import java.math.BigInteger;

/**
 * no String  * memory friendly implementation
 * 
 * @author cagatayyapici
 *
 */
public class LuhnCheck {
	public static boolean Check(BigInteger num1) {
		int sum = 0;
		long value = num1.longValueExact();
		int digitIdx = 0;
		long digit;

		do {
			digit = value % 10;
			if (++digitIdx % 2 == 0) {
				digit = (digit <<= 1 % 10) + 1;
				if (digit <= 9)
					digit--;
			}
			sum += digit;

		} while ((value /= 10) > 0);
		return (sum % 10 == 0);
	}
	
	
	
}