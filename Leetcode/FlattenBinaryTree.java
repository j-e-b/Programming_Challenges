import java.util.*;

/*
Given a binary tree, flatten it to a linked list in-place.

For example, given the following tree:

    1
   / \
  2   5
 / \   \
3   4   6

The flattened tree should look like:

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
*/

class FlattenBinaryTree
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
	
	ArrayList<Integer> nodes = new ArrayList<Integer>();

	// This method saves the given tree's preorder traversal in an array list.
	public void getList(TreeNode root)
	{
		if (root == null)
		{
			return ;
		}

		nodes.add(root.val);

		getList(root.left);
		getList(root.right);
	}

	// This method devolves the binary tree into a linked list along the right-sided
	// lineage.
	public void flattenTree(TreeNode root, int i)
	{
		// We have no more nodes to add on.
		if (i > nodes.size() - 1)
		{
			return;
		}

		if (nodes.size() > 1)
		{
			root.right = new TreeNode(nodes.get(i));
		}

		root.left = null;
		flattenTree(root.right, i + 1);
	}

	public void flatten(TreeNode root)
	{
		getList(root);
		flattenTree(root, 1);
	}
}
