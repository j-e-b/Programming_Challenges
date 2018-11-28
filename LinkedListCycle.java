/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
*/

class LinkedListCycle
{
	class ListNode
	{
		int val;
		ListNode next;

		public ListNode(int val)
		{
			this.val = val;
			next = null;
		}
	}

	// Space Complexity: O(1).
	public boolean hasCycleRecur(ListNode slow, ListNode fast)
	{
		if (fast == null || fast.next == null)
			return false;

		if (slow == fast)
			return true;

		return hasCycleRecur(slow.next, fast.next.next);
	}

	public boolean hasCycle(ListNode head)
	{
		if (head == null || head.next == null)
			return false;

		return hasCycleRecur(head, head.next);
	}
}
