import java.util.*;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

class TwoSum
{
	public int[] twoSum(int[] nums, int target)
	{
		HashMap<Integer, Integer> indexes = new HashMap<Integer, Integer>();

		// Store each value in the nums array along with with it's index into the
		// HashMap.
		for (int i = 0; i < nums.length; i++)
		{
			indexes.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++)
		{
			int complement = target - nums[i];

			// Is this complement in our HashMap? If so, we have found the two sum.
			if (indexes.containsKey(complement) && indexes.get(complement) != i)
			{
				return new int[] { indexes. get(complement), i };
			}
		}

		return null;
	}
}
