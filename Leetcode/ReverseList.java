import java.util.*;

/*
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
*/

public ReverseList
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

	public ListNode reverseListIterative(ListNode head)
	{
        Deque<Integer> stack = new ArrayDeque<Integer>();
				ListNode temp = head;
				ListNode sol;

				// Push each element on to the stack.
				while (temp != null)
				{
					stack.addFirst(temp.val);
					temp = temp.next;
				}

				// Initialize new list.
				if (stack.size() > 0)
				{
					sol = new ListNode(stack.removeFirst());
				}

				temp = sol;

				// Pop from the stack.
				while (stack.size() > 0)
				{
					temp.next = new ListNode(stack.removeFirst());
					temp = temp.next;
				}

				return sol;
	}

	public void reverseListRecursiveHelper(ListNode sol, Deque<Integer> stack)
	{
		if (stack.size() == 0)
		{
			return;
		}

		sol.next = new ListNode(stack.removeFirst());
		reverseListRecursiveHelper(sol.next, stack);
	}

	public void fillStack(ListNode temp, Deque<Integer> stack)
	{
		if (temp == null)
		{
			return;
		}

		stack.addFirst(temp.val);
		fillStack(temp.next, stack);
	}

	public ListNode reverseListRecursive(ListNode head)
	{
		Deque<Integer> stack = new ArrayDeque<Integer>();
		ListNode sol == null;

		fillStack(head, stack);

		if (stack.size() > 0)
		{
			sol = new ListNode(stack.removeFirst());
		}

		reverseListRecursiveHelper(sol, stack);

		return sol;
	}
}
