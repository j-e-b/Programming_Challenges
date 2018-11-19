import java.util.*;

/*
Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root
node down to the farthest leaf node.

For example, given a 3-ary tree:

				1
			/	|	\
		3		2		4
	/	\
5		6

We should return its max depth, which is 3.

Note:
- The depth of the tree is at most 1000.
- The total number of nodes is at most 5000.
*/

class MaxDepth
{
	class Node
	{
		public int val;
		public List<Node> children;

		public Node() {}

		public Node(int val, List<Node> children)
		{
			this.val = val;
			this.children = children;
		}
	}

	public int maxDepth(Node root)
	{
		if (root == null)
		{
			return 0;
		}
		if (root.children.isEmpty())
		{
			return 1;
		}

		List<Integer> heights = new ArrayList<Integer>();

		for (Node node : root.children)
		{
			heights.add(maxDepth(node));
		}

		return Collections.max(heights) + 1;
	}
}
