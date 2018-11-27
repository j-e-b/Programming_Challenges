import java.util.*;

/*
The longest common subsequence problem finds the length of the longest common
subsequence among two strings. Example: "GONIT" is a subsequence of "GOODNIGHT".

Example:
Input: "RACECAR" and "CREAM"
Output: 3
("REA" and "CEA" are possible subsequences)
*/

class LCSS
{
	public int lcss(String str1, String str2)
	{
		// Place the larger string in str1.
		if (str1.length() < str2.length())
		{
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}

		int[] memo = new int[str2.length() + 1];
		int diagValue;

		for (int i = 1; i <= str1.length(); i++)
		{
			// Initial diagonal value is always zero since we can assume the first
			// "column" is always zero.
			diagValue = 0;

			for (int j = 1; i <= str2.length(); j++)
			{
				// Next diagonal value.
				int temp = memo[j];

				// If we see matching character in the corresponding string indicies,
				// add 1 to the diagonal value and place it in memo[j].
				if (str1.charAt(i - 1) == str2.charAt(j - 1))
				{
					memo[j] = 1 + diagValue;
				}
				// Otherwise...
				else
				{
					memo[j] = Math.max(memo[j], memo[j - 1]);
				}

				diagValue = temp;
			}
		}
		// The last index will contain the solution.
		return memo[str2.length()];
	}
}
