import java.util.*;

/*
Given a string, you need to reverse the order of characters in each word within
a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not
be any extra space in the string.
*/

class ReverseWords
{
	public String solution(String s)
	{
		Deque<Character> stack = new ArrayDeque<Character>();
		String sol = "";
		int i = 0;

		while (i < s.length())
		{
			int count = 0;

			while (i < s.length() && !Character.isWhitespace(s.charAt(i)))
			{
				stack.push(s.charAt(i));
				i++;
				count++;
			}

			i++;

			for (int j = 0; j < count; j++)
			{
				sol += stack.pop();
			}
			if (i < s.length() - 1)
			{
				sol += " ";
			}
		}

		return sol;
	}
}
