class TreeToString
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

	public String tree2str(TreeNode t)
	{
		if (t == null)
		{
			return "";
		}

		if (t.left == null && t.right == null)
		{
			return Integer.toString(t.val);
		}

		if (t.right == null)
		{
			return Integer.toString(t.val) + "(" + tree2str(t.left) + ")";
		}

		return Integer.toString(t.val) + "(" + tree2str(t.left) + ")" + "(" + tree2str(t.right) + ")";
	}
}
