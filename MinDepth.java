/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root
node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
	 
return its minimum depth = 2.
*/

class MinDepth
{
	int min;

	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val)
		{
			this.val = val;
		}
	}

	public void minDepthRecur(TreeNode root, int depth)
	{
		if (root == null || depth > min)
		{
			return;
		}

		if (root.left == null && root.right == null)
		{
			if (depth < min)
			{
				min = depth;
			}
		}

		minDepthRecur(root.left, depth + 1);
		minDepthRecur(root.right, depth + 1);
	}

	public int minDepth(TreeNode root)
	{
		min = Integer.MAX_VALUE;

		minDepthRecur(root, 1);

		if (min == Integer.MAX_VALUE)
		{
			return 0;
		}

		return min;
	}
}
