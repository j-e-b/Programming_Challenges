import java.util.*;

/*
Given scores of N athletes, find their relative ranks and the people with the
top three highest scores, who will be awarded medals: "Gold Medal",
"Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]

Explanation: The first three athletes got the top three highest scores, so they
got "Gold Medal", "Silver Medal" and "Bronze Medal".
For the left two athletes, you just need to output their relative ranks
according to their scores.

Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.
*/

class RelativeRanks
{
	public String[] findRelativeRanks(int[] nums)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(nums.length, Collections.reverseOrder());

		// Store each value in our array into a max heap.
		for (int x: nums)
		{
			pq.add(x);
		}

		HashMap<Integer, Integer> ranks = new HashMap<Integer, Integer>();

		// Store the rank of each score in a HashMap.
		for (int i = 0; i < nums.length; i++)
		{
			ranks.put(pq.remove(), i);
		}

		String[] sol = new String[nums.length];

		// Using the HashMap, iterate through the ranks array and save each score's
		// corresponding rank to a new string array.
		for (int i = 0; i < nums.length; i++)
		{
			int index = ranks.get(nums[i]);

			if (index == 0)
			{
				sol[i] = "Gold Medal";
			}
			else if (index == 1)
			{
				sol[i] = "Silver Medal";
			}
			else if (index == 2)
			{
				sol[i] = "Bronze Medal";
			}
			else
			{
				sol[i] = String.valueOf(index + 1);
			}
		}

		return sol;
	}
}
