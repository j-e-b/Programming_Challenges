import java.util.*;

class FindModeBinaryTree
{
	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	HashMap<Integer, Integer> freqs = new HashMap<Integer, Integer>();
	int mode = 0;

	public void fillHash(TreeNode root)
	{
		if (root == null)
			return;

		int count = 1;

		if (freqs.containsKey(root.val))
		{
			count += freqs.get(root.val);
			freqs.put(root.val, count);
		}
		else
		{
			freqs.put(root.val, count);
		}

		if (count > mode)
			mode = count;

		fillHash(root.left);
		fillHash(root.right);
	}

	public int[] findMode(TreeNode root)
	{
		fillHash(root);

		int count = 0;

		for (int x : freqs.keySet())
			if (freqs.get(x) == mode)
				count++;

		int[] sol = new int[count];
		count = 0;

		for (int x : freqs.keySet())
			if (freqs.get(x) == mode)
				sol[count++] = x;

		return sol;
	}
}
