import java.util.*;

/*
It is the middle of 2018 and Maria Stepanovna, who lives outside Krasnokamensk
(a town in Zabaikalsky region), wants to rent three displays to highlight an
important problem.

There are n displays placed along a road, and the i-th of them can display a
text with font size si only. Maria Stepanovna wants to rent such three displays
with indices i<j<k that the font size increases if you move along the road in
a particular direction. Namely, the condition s(i)<s(j)<s(k) should be held.

The rent cost is for the i-th display is ci. Please determine the smallest cost
Maria Stepanovna should pay.

Input
The first line contains a single integer n — the number of displays.

The second line contains n integers s(1),s(2),…,s(n) — the font sizes on the
displays in the order they stand along the road.

The third line contains n integers c(1),c(2),…,c(n) — the rent costs for each
display.

Output
If there are no three displays that satisfy the criteria, print -1.
Otherwise print a single integer — the minimum total rent cost of three
displays with indices i<j<k such that s(i)<s(j)<s(k).

--------Examples--------
Input:
5
2 4 5 4 10
40 30 20 10 40

Output:
90
----------
Input:
3
100 101 100
2 4 5

Output:
-1
----------
Input:
10
1 2 3 4 5 6 7 8 9 10
10 13 11 14 15 12 13 13 18 13

Output:
33
----------
*/

class ThreeDisplays
{
	// Dynamic Programming Solution... O(n^2)
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numSigns = sc.nextInt();

		int[] signs = new int[numSigns];
		int[] costs = new int[numSigns];

		for (int i = 0; i < numSigns; i++)
			signs[i] = sc.nextInt();

		for (int i = 0; i < numSigns; i++)
			costs[i] = sc.nextInt();

		int first, second, third;
		int sol = Integer.MAX_VALUE;

		// If we pick the second sign, we can determine the cheapest sign before it
		// and the cheapest sign after it. The sum of these would be the overall
		// cost. If we assume s(i) to be the middle sign for every sign, we can
		// take the cheapest sum we have seen as our solution.
		for (int i = 0; i < numSigns; i++)
		{
			first = Integer.MAX_VALUE;
			second = costs[i];
			third = Integer.MAX_VALUE;

			// Preceding sign.
			for (int j = 0; j < i; j++)
				if (signs[j] < signs[i])
					first = Math.min(first, costs[j]);

			// Avoid integer overflow (this would be an invalid choice anyways).
			if (first == Integer.MAX_VALUE)
				continue;

			// Proceeding sign.
			for (int j = i; j < numSigns; j++)
				if (signs[j] > signs[i])
					third = Math.min(third, costs[j]);

			// Avoid integer overflow (this would be an invalid choice anyways).
			if (third == Integer.MAX_VALUE)
				continue;

			sol = Math.min(sol, first + second + third);

		}

		if (sol == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(sol);
	}


}
