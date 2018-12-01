import java.util.*;

class BinaryTreePaths
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

	List<String> sol;
	boolean flag = false;

	public void binaryTreePathsRecur(TreeNode root, String temp)
	{
		if (root == null)
			return;

		if (flag)
			temp += "->";

		temp += Integer.toString(root.val);
		flag = true;

		// Leaf node, add path to solution.
		if (root.left == null && root.right == null)
			sol.add(temp);

		binaryTreePathsRecur(root.left, temp);
		binaryTreePathsRecur(root.right, temp);
	}

	public List<String> binaryTreePaths(TreeNode root)
	{
		sol = new ArrayList<String>();

		String temp = "";

		binaryTreePathsRecur(root, temp);

		return sol;
	}
}
