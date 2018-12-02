import java.util.*;

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
