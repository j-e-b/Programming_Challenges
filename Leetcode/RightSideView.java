/*
Given a binary tree, imagine yourself standing on the right side of it, return
the values of the nodes you can see ordered from top to bottom.
*/

import java.util.*;

class Solution
{
	public ArrayList<Integer> solution;
	public int maxRight;

	public void solve(TreeNode root, int count)
	{
		if (root == null)
			return;

		if (count > maxRight)
		{
			solution.add(root.val);
			maxRight = count;
		}

		solve(root.right, count + 1);
		solve(root.left, count + 1);
	}

	public List<Integer> rightSideView(TreeNode root)
	{
		solution = new ArrayList<>();
		maxRight = -1;

		solve(root, 0);

		return solution;
	}
}
