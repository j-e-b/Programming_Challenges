import java.util.*;

/*
https://open.kattis.com/problems/aboveaverage
*/

class aboveaverage
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int numCases = stdin.nextInt();

		for (int i = 0; i < numCases; i++)
		{
			int numStudents = stdin.nextInt();
			double[] students = new double[numStudents];
			double avg = 0;

			for (int j = 0; j < numStudents; j++)
			{
				students[j] = stdin.nextDouble();
				avg += students[j];
			}

			avg /= (double)numStudents;

			//System.out.println(avg);

			double count = 0;

			for (int j = 0; j < numStudents; j++)
			{
				if (students[j] > avg)
				{
					count++;
				}
			}

			System.out.printf("%.3f%%\n", count/numStudents * 100);
		}
	}
}
