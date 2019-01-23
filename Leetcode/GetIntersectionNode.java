import java.util.*;

/*
Write a program to find the node at which the intersection of two singly linked
lists begins.

For example, the following two linked lists...

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3

...begin to intersect at node c1.


Notes:
If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
*/

class GetIntersectionNode
{
	public class ListNode
	{
		int val;
		ListNode next;

		public ListNode(int val)
		{
			this.val = val;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB)
	{
		HashMap<ListNode, Integer> seen = new HashMap<ListNode, Integer>();
		ListNode temp = headA;

		while (temp != null)
		{
			seen.put(temp, 1);
			temp = temp.next;
		}

		temp = headB;

		while (temp != null)
		{
			if (seen.containsKey(temp))
			{
				return temp;
			}

			temp = temp.next;
		}

		return null;
	}
}
