import java.util.*;

/*
Given a binary tree, return the inorder traversal of its nodes' values.
Use an iterative approach.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
*/

class InorderIterative
{
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

	public List<Integer> inorderTraversal(TreeNode root)
	{
		List<Integer> inorder = new ArrayList<Integer>();
		Deque<TreeNode> stack = new ArrayDeque<TreeNode>();

		TreeNode temp = root;

		while (temp != null || !stack.isEmpty())
		{
			// Traverse down the left-most path, adding each node to the stack.
			while (temp != null)
			{
				stack.push(temp);
				temp = temp.left;
			}

			// Pop from the stack, add the value to the list, move to the right
			// child (we have already added each left child), and repeat.
			temp = stack.pop();
			inorder.add(temp.val);
			temp = temp.right;
		}

		return inorder;
	}
}
