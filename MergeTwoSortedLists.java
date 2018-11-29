class MergeTwoSortedLists
{
	public class ListNode
	{
		int val;
		ListNode next;

		public ListNode(int val)
		{
			this.val = val;
		}
	}

	public void mergeRecur(ListNode l1, Listnode l2, ListNode sol)
	{
		if (l1 == null && l2 == null)
			return;

		if (l1 == null)
		{
			sol.next = new Listnode(l2.val);
			mergeRecur(l1, l2.next, sol.next);
		}
		else if (l2 == null)
		{
			if (l1.val < l2.val)
			{
				sol.next = new Listnode(l1.val);
				mergeRecur(l1.next, l2, sol.next);
			}
			else
			{
				sol.next = new ListNode(l2.val);
				mergeRecur(l1, l2.next, sol.next);
			}
		}
	}

	public Listnode mergeTwoLists(ListNode l1, ListNode l2)
	{
		if (l1 == null && l2 == null)
			return null;

		if (l1 == null)
		{
			sol = new Listnode(l2.val);
			mergeRecur(l1, l2.next, sol);
		}
		else if (l2 == null)
		{
			if (l1.val < l2.val)
			{
				sol = new Listnode(l1.val);
				mergeRecur(l1.next, l2, sol);
			}
			else
			{
				sol = new ListNode(l2.val);
				mergeRecur(l1, l2.next, sol);
			}
		}

		return sol;
	}
}
