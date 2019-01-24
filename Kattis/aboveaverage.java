import java.util.*;

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

	/*
	5
	5 50 50 70 80 100
	7 100 95 90 80 70 60 50
	3 70 90 80
	3 70 90 81
	9 100 99 98 97 96 95 94 93 91

	1
	5 50 50 70 80 100

	*/
}
