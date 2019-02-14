/*
	A binary tree is univalued if every node in the tree has the same value.
	Return true if and only if the given tree is univalued.
*/

import java.util.*;

public class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val)
	{
		this.val = val;
	}
}

class UnivaluedBinaryTree
{
	public boolean solve(TreeNode root, int val)
	{
		if (root == null)
			return true;

		if (root.val != val)
			return false;

		return solve(root.left, val) && solve(root.right, val);
	}

	public boolean isUnivalTree(TreeNode root)
	{
		if (root == null)
		{
			return root;
		}

		return solve(root.left, root.val) && solve(root.right, root.val);
	}
}
