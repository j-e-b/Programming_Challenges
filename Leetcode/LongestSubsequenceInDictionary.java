import java.util.*;

/*
Given a string and a string dictionary, find the longest string in the
dictionary that can be formed by deleting some characters of the given string.
If there are more than one possible results, return the longest word with the
smallest lexicographical order. If there is no possible result, return the empty
string.
----------
Example 1:

Input:
s = "abpcplea", d = ["ale","apple","monkey","plea"]

Output:
"apple"
----------
Example 2:

Input:
s = "abpcplea", d = ["a","b","c"]

Output:
"a"
----------
Note:
All the strings in the input will only contain lower-case letters.
The size of the dictionary won't exceed 1,000.
The length of all the strings in the input won't exceed 1,000.
*/

class LongestSubsequenceInDictionary
{
	public String findLongestWord(String s, List<String> d)
	{
		int[] matches = new int[d.size()];
		int max = -1;
		String sol = "";

		for (int i = 0; i < s.length(); i++)
		{
			for (int j = 0; j < d.size(); j++)
			{
				if (matches[j] < d.get(j).length())
				{
					if (s.charAt(i) == d.get(j).charAt(matches[j]))
					{
						matches[j]++;
					}
				}
			}
		}

		for (int i = 0; i < d.size(); i++)
		{
			if (matches[i] == d.get(i).length())
			{
				if (sol == "" || d.get(i).length() > max)
				{
					sol = d.get(i);
					max = d.get(i).length();
				}
				else if (max == d.get(i).length() && sol.compareTo(d.get(i)) > 0)
				{
					sol = d.get(i);
				}
			}
		}

		return sol;
	}
}
