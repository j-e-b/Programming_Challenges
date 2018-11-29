/*
Merge two sorted linked lists and return it as a new list. The new list should
be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/

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

	public void mergeRecur(ListNode l1, ListNode l2, ListNode sol)
	{
		if (l1 == null && l2 == null)
			return;

		if (l1 == null)
		{
			sol.next = new ListNode(l2.val);
			mergeRecur(l1, l2.next, sol.next);
		}
		else if (l2 == null)
		{
			if (l1.val < l2.val)
			{
				sol.next = new ListNode(l1.val);
				mergeRecur(l1.next, l2, sol.next);
			}
			else
			{
				sol.next = new ListNode(l2.val);
				mergeRecur(l1, l2.next, sol.next);
			}
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		if (l1 == null && l2 == null)
			return null;

		ListNode sol;

		if (l1 == null)
		{
			sol = new ListNode(l2.val);
			mergeRecur(l1, l2.next, sol);
		}
		else if (l2 == null)
		{
			if (l1.val < l2.val)
			{
				sol = new ListNode(l1.val);
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
