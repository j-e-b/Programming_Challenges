class BinaryTreeTilt
{
	int tilt = 0;

	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode (int val)
		{
			this.val = val;
		}
	}

	public int treeTraversal(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}

		int leftTilt = treeTraversal(root.left);
		int rightTilt = treeTraversal(root.right);
		tilt += Math.abs(leftTilt - rightTilt);
		return leftTilt + rightTilt + root.val;
	}

	public int findTilt(TreeNode root)
	{
		treeTraversal(root);
		return tilt;
	}

}
