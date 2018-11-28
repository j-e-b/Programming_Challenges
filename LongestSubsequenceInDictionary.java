import java.util.*;

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
