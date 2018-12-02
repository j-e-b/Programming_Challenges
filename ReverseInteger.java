import java.util.*;
/*
Given a 32-bit signed integer, reverse digits of an integer.
----------
Example 1:

Input: 123
Output: 321
----------
Example 2:

Input: -123
Output: -321
----------
Example 3:

Input: 120
Output: 21
----------
Note:
Assume we are dealing with an environment which could only store integers within
the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose of this
problem, assume that your function returns 0 when the reversed integer overflows.
*/

class ReverseInteger
{
	public int reverse(int x)
	{
		String s = Integer.toString(x);
		String sol = "";

		if (x < 0)
			sol += "-";

		for (int i = s.length() - 1; i >= 0; i--)
		{
			if (x < 0 && i == 0)
				break;

			sol += s.charAt(i);
		}

		long retVal = Long.parseLong(sol);

		if (retVal > Integer.MAX_VALUE || retVal < Integer.MIN_VALUE)
			return 0;

		return (int)retVal;
	}
}
