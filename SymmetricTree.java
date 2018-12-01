/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric
around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
*/

class SymmetricTree
{
	public boolean isSymmetricRecur(TreeNode t1, TreeNode t2)
	{
		if (t1 == null && t2 == null)
			return true;

		if (t1 == null || t2 == null)
			return false;

		if (t1.val != t2.val)
			return false;

		return isSymmetricRecur(t1.left, t2.right) && isSymmetricRecur(t1.right, t2.left);
	}

	public boolean isSymmetric(TreeNode root)
	{
		return isSymmetricRecur(root, root);
	}
}
