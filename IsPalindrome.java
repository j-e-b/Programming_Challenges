class IsPalindrome
{
	public boolean IsPalindrome(int x)
	{
		long reverseNum = 0;

		if ( x < 0)
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
