import java.util.*;

/*
https://open.kattis.com/problems/aaah
*/

class aaah
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		String jon = stdin.next();
		String doc = stdin.next();

		int jonCount = jon.length() - 1;
		int docCount = doc.length() - 1;

		if (jonCount < docCount)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("go");
		}
	}
}
