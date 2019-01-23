/*
Determine whether an integer is a palindrome. An integer is a palindrome when
it reads the same backward as forward.

Example 1:

Input: 121
Output: true

Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes
121-. Therefore it is not a palindrome.

Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
*/

class IsPalindrome
{
	public boolean isPalindrome(int x)
	{
		long reverseNum = 0;

		if (x < 0)
			return false;

		if (x % 10 == 0 && x != 0)
			return false;

		// Take half of x and reverse it.
		while (x > reverseNum)
		{
			reverseNum *= 10;
			reverseNum += x % 10;
			x /= 10;
		}

		// Avoid overflow.
		if (reverseNum > Integer.MAX_VALUE)
			return false;

		return (x == (int)reverseNum || x == (int)reverseNum / 10);
	}
}
