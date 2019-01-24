import java.util.*;

/*
https://open.kattis.com/problems/3dprinter
*/

class Printer
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int numStatues = stdin.nextInt();

		int i = 0;
		int twos = 1;

		while (twos < numStatues)
		{
			twos *= 2;
			i++;
		}

		i++;

		System.out.println(i);
	}
}
