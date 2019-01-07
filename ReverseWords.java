import java.util.*;

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
