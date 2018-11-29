import java.util.*;

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

				while (stack.size() > 0)
				{
					temp.next = new ListNode(stack.removeFirst());
					temp = temp.next;
				}

				return sol;
	}
}
