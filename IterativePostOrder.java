import java.util.*;

/*
Given a binary tree, return the postorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]

Implement the function iteratively.
*/

class IterativePostOrder
{
	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int x)
		{
			val = x;
		}
	}

	public List<Integer> postorderTraversal(TreeNode root)
	{
		LinkedList<TreeNode> nodeStack = new LinkedList<TreeNode>();
		LinkedList<Integer> solution = new LinkedList<Integer>();

		if (root == null)
		{
			return solution;
		}

		nodeStack.add(root);

		while (!nodeStack.isEmpty())
		{
			TreeNode temp = nodeStack.pollLast();

			solution.addFirst(temp.val);

			if (temp.left != null)
			{
				nodeStack.add(temp.left);
			}
			if (temp.right != null)
			{
				nodeStack.add(temp.right);
			}
		}

		return solution;
	}
}
