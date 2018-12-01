/*
Given an integer array nums, find the contiguous subarray (containing at least
one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

class MaxSubArray
{
	public int maxSubArray(int[] nums)
	{
		int max = nums[0], tempMax = nums[0];

		for (int i = 1; i < nums.length; i++)
		{
			tempMax = Math.max(tempMax + nums[i], nums[i]);
			max = Math.max(tempMax, max);
		}

		return max;
	}
}
