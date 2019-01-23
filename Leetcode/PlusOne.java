/*
Given a non-empty array of digits representing a non-negative integer, plus one
to the integer.

The digits are stored such that the most significant digit is at the head of the
list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number
0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/

class PlusOne
{
	public int[] plusOne(int[] digits)
	{
		int i = digits.length - 1;
		boolean flag = false;

		while (digits[i] == 9)
		{
			digits[i] = 0;

			if (i == 0)
			{
				flag = true;
				break;
			}

			i--;
		}

		int sol[];

		if (flag)
		{
			sol = new int[digits.length + 1];
			sol[0] = 1;
			i = 1;
		}
		else
		{
			sol = new int[digits.length];
			digits[i]++;
			i = 0;
		}

		for (int j = 0; j < digits.length; j++)
		{
			sol[i++] = digits[j];
		}

		return sol;
	}
}
