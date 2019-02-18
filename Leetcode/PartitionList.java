class Solution
{
	public Listnode partition(ListNode head, int x)
	{
		ListNode lessHead = null, lessTemp = null;
		ListNode moreHead = null, moreTemp = null;
		ListNode temp = head;

		if (head == null)
			return null;

		while (temp != null)
		{
			if (temp.val < x)
			{
				if (lessHead == null)
				{
					lessHead = temp;
					lessTemp = lessHead;
				}
				else
				{
					lessTemp.next = temp;
					lessTemp = lessTemp.next;
				}
			}
			else
			{
				if (moreHead == null)
				{
					moreHead = temp;
					moreTemp = moreHead;
				}
				else
				{
					moreTemp.next = temp;
					moreTemp = moreTemp.next;
				}
			}

			temp = temp.next;
		}

		if (lessHead == null)
			return moreHead;

		if (moreHead == null)
			return lessHead;

		lessTemp.next = moreHead;
		moreTemp.next = null;

		return lessHead;
	}
}
