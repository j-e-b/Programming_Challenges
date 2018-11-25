import java.util.*;

/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
*/

class FirstUniqChar
{
	public int firstUniqChar(String s)
	{
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++)
		{
			if (counts.containsKey(s.charAt(i)))
			{
				int count = counts.get(s.charAt(i));
				counts.put(s.charAt(i), count + 1);
			}
			else
			{
				counts.put(s.charAt(i), 1);
			}
		}

		for (int i = 0; i < s.length(); i++)
		{
			if (counts.get(s.charAt(i)) == 1)
			{
				return i;
			}
		}

		return -1;
	}
}
